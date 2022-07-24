package com.admissions.empty_project.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.admissions.empty_project.data.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : Fragment(R.layout.fragment_main) {

    private val viewModel: MainViewModel by viewModels()

}