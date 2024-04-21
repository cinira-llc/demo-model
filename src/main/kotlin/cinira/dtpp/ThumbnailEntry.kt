package cinira.dtpp

import cinira.Model

@Model
data class ThumbnailEntry(
    val contentType: String,
    val dimensions: Array<Int>,
    val dpi: Int,
    val size: Long
)
