package com.codelabs.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * StatelessCounter 는
 * count 를 표시하고 count 를 늘릴때 함수를 호출한다. 
 * 이렇게 하려면 count 상태와 onIncrement 를 전달해야한다. 
 */
@Composable
fun StatelessCounter(
    count: Int,
    onIncrement: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.padding(16.dp)) {
        if (count > 0) {
            Text("You've had $count glasses.")
        }
        Button(onClick = onIncrement,
            Modifier.padding(8.dp),
            enabled = count < 10
        ) {
            Text(text = "Add one")
        }
    }
}
