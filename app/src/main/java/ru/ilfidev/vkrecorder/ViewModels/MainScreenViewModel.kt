package ru.ilfidev.vkrecorder.ViewModels

import android.icu.text.AlphabeticIndex
import android.media.MediaRecorder
import android.os.Environment
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.runBlocking
import java.io.IOException

class MainScreenViewModel : ViewModel() {
    private lateinit var mediaRecorder: MediaRecorder
    private lateinit var filePath: String


    fun startRecording() = runBlocking{
       record()
    }

    private suspend fun record(){
        coroutineScope{

            filePath = Environment.getExternalStorageDirectory().absolutePath + "/" + "A" + ".3gp"

            mediaRecorder = MediaRecorder()
            mediaRecorder.setAudioSource(MediaRecorder.AudioSource.MIC)
            mediaRecorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP)
            mediaRecorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB)
            //mediaRecorder.setOutputFile(filePath)
            try{
                mediaRecorder.prepare()
                mediaRecorder.start()
            } catch (e: IOException){
                e.printStackTrace()
            } catch (e: java.lang.IllegalStateException){
                e.printStackTrace()
            }
        }
    }
    private fun stop() : Record {
        try
    }
    fun stopRecording() = runBlocking {

    }
}