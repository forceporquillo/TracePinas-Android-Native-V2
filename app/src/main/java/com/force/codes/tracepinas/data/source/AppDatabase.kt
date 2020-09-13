/*
 * Created by Force Porquillo on 9/4/20 5:30 PM
 */

package com.force.codes.tracepinas.data.source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.force.codes.tracepinas.data.model.doh_csv_data_drop.DayOne
import com.force.codes.tracepinas.data.model.doh_csv_data_drop.Provinces
import com.force.codes.tracepinas.data.model.per_country.PerCountry

@Database(
  entities = [
    DayOne::class,
    PerCountry::class,
    Provinces::class
  ], version = 1, exportSchema = false
)

abstract class AppDatabase : RoomDatabase() {
  abstract fun changeCountryDao(): ChangeCountryDao
  abstract fun listViewDao(): ListViewDao

}