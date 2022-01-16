package com.example.day1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.applikeysolutions.cosmocalendar.selection.OnDaySelectedListener
import com.applikeysolutions.cosmocalendar.selection.RangeSelectionManager
import com.applikeysolutions.cosmocalendar.view.CalendarView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val calendar_view = findViewById<CalendarView>(R.id.calendar_view)
        calendar_view.isShowDaysOfWeekTitle = false
        calendar_view.selectionManager = RangeSelectionManager(OnDaySelectedListener {
            Log.e(" CALENDAR ", "========== setSelectionManager ==========")
            Log.e(" CALENDAR ", "Selected Dates : " + calendar_view.selectedDates.size)
            if (calendar_view.selectedDates.size <= 0) return@OnDaySelectedListener
            Log.e(" CALENDAR ", "Selected Days : " + calendar_view.selectedDays.map { "${it.dayNumber}" })
        })
    }
}
