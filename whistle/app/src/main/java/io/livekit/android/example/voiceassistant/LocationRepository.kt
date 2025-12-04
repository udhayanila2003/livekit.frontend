package io.livekit.android.example.voiceassistant

import android.location.Location
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

object LocationRepository {
    private val _location = MutableStateFlow<Location?>(null)
    val location = _location.asStateFlow()

    fun updateLocation(location: Location) {
        _location.value = location
    }
}
