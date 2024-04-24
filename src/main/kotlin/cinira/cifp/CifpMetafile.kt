package cinira.cifp

import cinira.Model
import com.fasterxml.jackson.annotation.JsonFormat
import java.time.Instant

@Model
data class CifpMetafile(

    /**
     * Official cycle number (4-digit.)
     */
    val cycle: Int,

    @JsonFormat(shape = JsonFormat.Shape.STRING, timezone = "UTC")
    val effectiveEnd: Instant,

    @JsonFormat(shape = JsonFormat.Shape.STRING, timezone = "UTC")
    val effectiveStart: Instant
)
