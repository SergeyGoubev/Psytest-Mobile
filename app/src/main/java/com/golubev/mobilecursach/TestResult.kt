package com.golubev.mobilecursach

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.formatter.ValueFormatter
import com.golubev.mobilecursach.rest.response.ResultTestDto
import com.golubev.mobilecursach.utils.SessionManager
import kotlinx.android.synthetic.main.activity_test_result.*

class TestResult : AppCompatActivity() {

    private lateinit var sessionManager: SessionManager

    var previousPage = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_result)
        val resultTest : ResultTestDto = intent.getSerializableExtra("result") as ResultTestDto
        previousPage = intent.getStringExtra("previousPage")!!

        //клик по кнопке "профиль"
        profile.setOnClickListener {
            // проверка авторизации
            sessionManager = SessionManager(this)
            var token :String? = sessionManager.getAuthToken()
            if (token != null) {
                val intent = Intent(this, Personal::class.java)
                startActivity(intent)
            } else {
                val intent = Intent(this, AuthActivity::class.java)
                startActivity(intent)
            }
        }

        //клик по кнопке "тест"
        Test.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        //клик по кнопке "тест"
        descType.setOnClickListener {
            val intent = Intent(this, DescriptoinType::class.java)
            startActivity(intent)
        }

        setBarChart(resultTest)
    }



    private fun setBarChart(result: ResultTestDto) {

        var xAxis = testResultChart.xAxis
        xAxis.position = XAxis.XAxisPosition.BOTTOM
        xAxis.setDrawGridLines(false)
        xAxis.valueFormatter = PsychotypeFormatter()

        val entries = ArrayList<BarEntry>()
        entries.add(BarEntry(1f, result.demonstrativeType.toFloat()))
        entries.add(BarEntry(2f, result.stuckType.toFloat()))
        entries.add(BarEntry(3f, result.pedanticType.toFloat()))
        entries.add(BarEntry(4f, result.excitableType.toFloat()))
        entries.add(BarEntry(5f, result.hyperthymicType.toFloat()))
        entries.add(BarEntry(6f, result.dysthymicType.toFloat()))
        entries.add(BarEntry(7f, result.anxiouslyFearfulType.toFloat()))
        entries.add(BarEntry(8f, result.emotionallyExaltedType.toFloat()))
        entries.add(BarEntry(9f, result.emotiveType.toFloat()))
        entries.add(BarEntry(10f, result.cyclothymicType.toFloat()))

        val dataSet = BarDataSet(entries, "Результат")

        val data = BarData(dataSet)
        testResultChart.data = data
        testResultChart.setFitBars(false)
        xAxis.setDrawGridLines(false)
        xAxis.granularity = 1f
        xAxis.labelCount = 10
        testResultChart.invalidate()
        testResultChart.animate()

        if(result.demonstrativeType.toFloat() > 17 ){
            demonstrative.visibility = View.VISIBLE
            demonstrative.text = getString(R.string.demonstrativejob)
        } else {
            demonstrative.visibility = View.GONE
        }
        if(result.stuckType.toFloat() > 17 ){
            stuck.visibility = View.VISIBLE
            stuck.text = getString(R.string.stuckjob)
        } else {
            stuck.visibility = View.GONE
        }
        if(result.pedanticType.toFloat() > 17 ){
            pedantic.visibility = View.VISIBLE
            pedantic.text = getString(R.string.pedanticjob)
        } else {
            pedantic.visibility = View.GONE
        }
        if(result.excitableType.toFloat() > 17 ){
            excitable.visibility = View.VISIBLE
            excitable.text = getString(R.string.excitablejob)
        } else {
            excitable.visibility = View.GONE
        }
        if(result.hyperthymicType.toFloat() > 17 ){
            hyperthymic.visibility = View.VISIBLE
            hyperthymic.text = getString(R.string.hyperthymicjob)
        } else {
            hyperthymic.visibility = View.GONE
        }
        if(result.dysthymicType.toFloat() > 17 ){
            disthymic.visibility = View.VISIBLE
            disthymic.text = getString(R.string.disthymicjob)
        } else {
            disthymic.visibility = View.GONE
        }
        if(result.anxiouslyFearfulType.toFloat() > 17 ){
            anxiouslyFearFull.visibility = View.VISIBLE
            anxiouslyFearFull.text = getString(R.string.anxiouslyFearFulljob)
        } else {
            anxiouslyFearFull.visibility = View.GONE
        }
        if(result.emotionallyExaltedType.toFloat() > 17 ){
            emotionally.visibility = View.VISIBLE
            emotionally.text = getString(R.string.emotionallyjob)
        } else {
            emotionally.visibility = View.GONE
        }
        if(result.emotiveType.toFloat() > 17 ){
            emotive.visibility = View.VISIBLE
            emotive.text = getString(R.string.emotivejob)
        } else {
            emotive.visibility = View.GONE
        }
        if(result.cyclothymicType.toFloat() > 17 ){
            cyclothymic.visibility = View.VISIBLE
            cyclothymic.text = getString(R.string.cyclothymicjob)
        } else {
            cyclothymic.visibility = View.GONE
        }

    }

    class PsychotypeFormatter : ValueFormatter() {

        final val xLabel  = listOf("Демонстративный тип",
            "Застенчивый тип",
            "Педантичный тип",
            "Возбудимый тип",
            "Гипертимный тип",
            "Дистимический тип",
            "Тревожно-боязливый тип",
            "Аффективно-экзальтированный тип",
            "Эмотивный тип",
            "Циклотимный тип")

        override fun getFormattedValue(value: Float): String {
            return xLabel[value.toInt()-1]
        }
    }
}

