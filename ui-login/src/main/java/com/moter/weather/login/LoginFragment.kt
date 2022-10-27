package com.moter.weather.login

import android.os.Bundle
import android.view.View
import androidx.core.net.toUri
import androidx.fragment.app.Fragment
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.fragment.findNavController
import com.moter.weather.login.databinding.FragmentLoginBinding

class LoginFragment : Fragment(R.layout.fragment_login) {
    private lateinit var binding: FragmentLoginBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentLoginBinding.bind(view)

        binding.btnEnter.setOnClickListener {
            if (binding.etApiKey.text.isNotEmpty()) {
                val deepLink =
                    "android-app://com.moter.weather/dashboard_fragment?api_key=${binding.etApiKey.text}".toUri()
                val request = NavDeepLinkRequest.Builder
                    .fromUri(deepLink)
                    .build()

                findNavController().navigate(request)
            }
        }
    }
}