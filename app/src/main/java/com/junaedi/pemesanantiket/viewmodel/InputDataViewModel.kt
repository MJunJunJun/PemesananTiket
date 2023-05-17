package com.junaedi.pemesanantiket.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.junaedi.pemesanantiket.database.DatabaseClient.Companion.getInstance
import com.junaedi.pemesanantiket.database.dao.DatabaseDao
import com.junaedi.pemesanantiket.model.ModelDatabase
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.schedulers.Schedulers

class InputDataViewModel(application: Application) : AndroidViewModel(application) {

}