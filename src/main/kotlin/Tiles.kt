import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.toComposeImageBitmap

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


object Tiles {
    private const val PATH = "tiles"
    private const val IMAGE_BLANK = "$PATH/blank.png"
    private const val IMAGE_UP = "$PATH/up.png"
    private const val IMAGE_DOWN = "$PATH/down.png"
    private const val IMAGE_LEFT = "$PATH/left.png"
    private const val IMAGE_RIGHT = "$PATH/right.png"

    val blank: ImageBitmap by lazy { loadImage(IMAGE_BLANK) }
    val up: ImageBitmap by lazy { loadImage(IMAGE_UP) }
    val down: ImageBitmap by lazy { loadImage(IMAGE_DOWN) }
    val left: ImageBitmap by lazy { loadImage(IMAGE_LEFT) }
    val right: ImageBitmap by lazy { loadImage(IMAGE_RIGHT) }

    private fun loadImage(path: String): ImageBitmap {
        val sourceStream = javaClass.getResourceAsStream(path) ?: throw NoSuchElementException("the $path is not exist")
        return org.jetbrains.skia.Image.makeFromEncoded(sourceStream.readBytes()).toComposeImageBitmap()
    }
}

