<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"


    android:gravity="center"
    tools:context=".shedule">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:gravity="top"
        android:layout_marginTop="80dp"
        android:orientation="vertical"
        >
        <AutoCompleteTextView
            android:id="@+id/shedule_enter_pickuppoint"
            android:layout_width="match_parent"
            android:layout_margin="5dp"
            android:layout_height="40dp"
            android:hint="Pickup Point"
            android:gravity="center"
            android:background="@drawable/curvecorner"
            />
        <AutoCompleteTextView
            android:id="@+id/shedule_enter_destination"
            android:layout_width="match_parent"
            android:layout_margin="5dp"
            android:layout_height="40dp"
            android:hint="Destination"
            android:gravity="center"
            android:background="@drawable/curvecorner"
            />
        <TextView
            android:id="@+id/shedule_enter_date_time"
            android:layout_width="match_parent"
            android:layout_margin="5dp"
            android:layout_height="30dp"
            android:hint="Time"
            android:gravity="center"
            android:ems="10"
            android:inputType="date"
            android:background="@drawable/curvecorner"
            />
        <Button
            android:id="@+id/shedule"
            android:layout_width="120dp"
            android:layout_height="wrap_content"
            android:layout_gravity="center"
            android:text=" SCHEDULE RIDE "
            android:background="@drawable/buttoncurvecorner"
            android:textColor="@android:color/background_dark"
            android:layout_marginTop="10dp"
            />

        <Button
            android:id="@+id/show_schedule_btn"
  