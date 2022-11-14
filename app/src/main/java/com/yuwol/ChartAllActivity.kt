package com.yuwol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.yuwol.adapter.ChartAllAdapter
import com.yuwol.databinding.ActivityChartAllBinding
import com.yuwol.model.Chart

class ChartAllActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityChartAllBinding
    private lateinit var chartAdapter: ChartAllAdapter
    private val chartData = mutableListOf<Chart>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChartAllBinding.inflate(layoutInflater)

        setContentView(binding.root)

        initChartList()
        initChartRecyclerView()
    }

    private fun initChartRecyclerView() {
        binding.rvChartAll.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        chartAdapter = ChartAllAdapter()
        chartAdapter.dataList = chartData
        binding.rvChartAll.adapter = chartAdapter
    }

    private fun initChartList() {
        var rank = 1
        chartData.addAll(
            listOf<Chart>(
                Chart(
                    R.drawable.cover,
                    rank++.toString(),
                    "사건의 지평선",
                    "윤하",
                    "5", "찢음", "5","2","1"
                ), Chart(
                    R.drawable.cover,
                    rank++.toString(),
                    "ANTIFRAGILE",
                    "LE SSERAFIM (르세라핌)",
                    "2", "보통", "1", "2", "1"
                ), Chart(
                    R.drawable.cover,
                    rank++.toString(),
                    "Hype Boy",
                    "NewJeans",
                    "2", "보통", "2", "2", "1"
                ), Chart(
                    R.drawable.cover,
                    rank++.toString(),
                    "Nxde",
                    "(여자)아이들",
                    "4", "싸해짐", "1","2","4"
                ), Chart(
                    R.drawable.cover,
                    rank++.toString(),
                    "After Like",
                    "IVE (아이브)",
                    "2", "찢음", "2", "1", "2"
                ), Chart(
                    R.drawable.cover,
                    rank++.toString(),
                    "Attention",
                    "NewJeans",
                    "3", "싸해짐", "2", "2", "1"
                )
            )
        )
    }
}