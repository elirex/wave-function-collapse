/*
 * Copyright 2023 Wang Sheng-Yuan (elirex)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import androidx.compose.material.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application


@Composable
@Preview
fun App() {
    MaterialTheme {
        Row {
            Image(
                bitmap = Tiles.blank,
                contentDescription = "blank",
                modifier = Modifier.padding(1.dp)
            )
            Image(
                bitmap = Tiles.up,
                contentDescription = "up",
                modifier = Modifier.padding(1.dp)
            )
            Image(
                bitmap = Tiles.down,
                contentDescription = "down",
                modifier = Modifier.padding(1.dp)
            )
            Image(
                bitmap = Tiles.left,
                contentDescription = "left",
                modifier = Modifier.padding(1.dp)
            )
            Image(
                bitmap = Tiles.right,
                contentDescription = "right",
                modifier = Modifier.padding(1.dp)
            )
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
