package com.moter.weather.dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.moter.weather.core.common.Exclude
import com.moter.weather.core.common.OneCallRequestBody
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DashboardFragment : Fragment(R.layout.fragment_dashboard) {

    private val viewModel: DashboardViewModel by viewModels()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getWeatherData(OneCallRequestBody(
            lat = "",
            lon = "",
            exclude = Exclude.alerts,
            api_key =""
        ))
    }
}