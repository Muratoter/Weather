package com.moter.weather.dashboard

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.moter.weather.core.common.Exclude
import com.moter.weather.core.common.OneCallRequestBody
import com.moter.weather.dashboard.databinding.FragmentDashboardBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import timber.log.Timber

@AndroidEntryPoint
class DashboardFragment : Fragment(R.layout.fragment_dashboard) {

    private val viewModel: DashboardViewModel by viewModels()
    private lateinit var binding: FragmentDashboardBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDashboardBinding.bind(view)
        // TODO: get current location, get api key from user
        viewModel.getWeatherData(
            OneCallRequestBody(
                lat = "40.9582687",
                lon = "29.0992816",
                exclude = Exclude.alerts,
                api_key = "8ddadecc7ae4f56fee73b2b405a63659"
            )
        )

        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.uiState.collect {
                    Timber.d("UIState ${it.text}")
                    binding.tvResult.text = it.text
                }
            }
        }
    }
}