package com.codelabs.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.runtime.*

/**
 * StatefulCounter 는 상태를 소유한다.
 * count 의 상태를 보유하고 Stateless 함수를 호출할때
 * 그 상태를 수정한다.
 */
@Composable
fun StatefulCounter(
    modifier: Modifier = Modifier
) {
    var waterCount by rememberSaveable {
        mutableStateOf(0)
    }
    StatelessCounter(count = waterCount, onIncrement = { waterCount++ }, modifier)
}
