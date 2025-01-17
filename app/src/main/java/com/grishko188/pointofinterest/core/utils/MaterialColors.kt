package com.grishko188.pointofinterest.core.utils

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import java.util.*


object MaterialColors {

    fun getColor(colorString: String): Color {
        return Color(android.graphics.Color.parseColor(colorString.trim()))
    }

    val redOne = listOf("#FFEBEE", "#FFCDD2", "#EF9A9A", "#E57373", "#EF5350", "#F44336", "#E53935", "#D32F2F", "#C62828", "#B71C1C")
    val redTwo = listOf("#FF8A80", "#FF5252", "#FF1744", "#D50000")

    val pink =
        listOf("#FCE4EC", "#F8BBD0", "#F48FB1", "#F48FB1", "#F06292", "#EC407A", "#E91E63", "#D81B60", "#C2185B", "#AD1457", "#880E4F")
    val pinktwo = listOf("#FF80AB", "#FF4081", "#F50057", "#C51162")

    val purple = listOf("#D1C4E9", "#B39DDB", "#9575CD", "#7E57C2", "#673AB7", "#5E35B1", "#512DA8", "#4527A0", "#311B92")
    val purpleTwo = listOf("#B388FF", "#7C4DFF", "#651FFF", "#6200EA")

    val indigo = listOf("#E8EAF6", "#C5CAE9", "#9FA8DA", "#7986CB", "#5C6BC0", "#3F51B5", "#3949AB", "#303F9F", "#283593", "#1A237E")
    val indigoTwo = listOf("#8C9EFF", "#536DFE", "#3D5AFE", "#304FFE")

    val blue = listOf(
        "#E3F2FD",
        "#BBDEFB",
        "#90CAF9",
        "#64B5F6",
        "#42A5F5",
        "#2196F3",
        "#1E88E5",
        "#1976D2",
        "#1565C0",
        "#0D47A1",
    )
    val blueTwo = listOf(
        "#82B1FF",
        "#448AFF",
        "#2979FF",
        "#2962FF",
    )

    val lightBlue = listOf(
        "#E1F5FE",
        "#B3E5FC",
        "#81D4FA",
        "#4FC3F7",
        "#29B6F6",
        "#03A9F4",
        "#039BE5",
        "#0288D1",
        "#0277BD",
        "#01579B",
    )

    val cyan = listOf(
        "#E0F7FA",
        "#B2EBF2",
        "#80DEEA",
        "#4DD0E1",
        "#26C6DA",
        "#00BCD4",
        "#00ACC1",
        "#0097A7",
        "#00838F",
        "#006064"
    )

    val cyanLight = listOf(
        "#84FFFF",
        "#18FFFF",
        "#00E5FF",
        "#00B8D4",
    )

    val teal = listOf(
        "#E0F2F1",
        "#B2DFDB",
        "#80CBC4",
        "#4DB6AC",
        "#26A69A",
        "#009688",
        "#00897B",
        "#00796B",
        "#00695C",
        "#004D40",
    )
    val tealLight = listOf(
        "#A7FFEB",
        "#64FFDA",
        "#1DE9B6",
        "#00BFA5",
    )

    val green = listOf(
        "#C8E6C9",
        "#A5D6A7",
        "#81C784",
        "#66BB6A",
        "#4CAF50",
        "#43A047",
        "#388E3C",
        "#2E7D32",
        "#1B5E20",
    )

    val greenLight = listOf(
        "#B9F6CA",
        "#69F0AE",
        "#00E676",
        "#00C853",
    )

    val greenLighter = listOf(
        "#F1F8E9",
        "#DCEDC8",
        "#C5E1A5",
        "#AED581",
        "#9CCC65",
        "#8BC34A",
        "#7CB342",
        " #689F38",
        "#558B2F",
        "#33691E",
    )

    val greenLighterLight = listOf(
        "#CCFF90",
        "#B2FF59",
        "#76FF03",
        "#64DD17",
    )

    val lime = listOf(
        "#F9FBE7",
        "#F0F4C3",
        "#E6EE9C",
        "#DCE775",
        "#D4E157",
        "#CDDC39",
        "#C0CA33",
        "#AFB42B",
        "#9E9D24",
        "#827717",
    )

    val limeLight = listOf(
        "#F4FF81",
        "#EEFF41",
        "#C6FF00",
        "#AEEA00"
    )

    val yellow = listOf(
        "#FFFDE7",
        "#FFF9C4",
        "#FFF59D",
        "#FFF176",
        "#FFEE58",
        "#FFEB3B",
        "#FDD835",
        "#FBC02D",
        "#F9A825",
        "#F57F17",
    )

    val yellowLight = listOf(
        "#FFFF8D",
        "#FFFF00",
        "#FFEA00",
        "#FFD600",
    )

    val amber = listOf(
        "#FFF8E1",
        "#FFECB3",
        "#FFE082",
        "#FFD54F",
        "#FFCA28",
        "#FFC107",
        "#FFB300",
        "#FFA000",
        "#FF8F00",
        "#FF6F00"
    )

    val amberLight = listOf(
        "#FFE57F",
        "#FFD740",
        "#FFC400",
        "#FFAB00",
    )

    val orange = listOf(
        "#FFF3E0",
        "#FFE0B2",
        "#FFCC80",
        "#FFB74D",
        "#FFA726",
        "#FF9800",
        "#FB8C00",
        "#F57C00",
        "#EF6C00",
        "#E65100",
    )

    val orangeLight = listOf(
        "#FFD180",
        "#FFAB40",
        "#FF9100",
        "#FF6D00",
    )

    val deepOrange = listOf(
        "#FBE9E7",
        "#FFCCBC",
        "#FFAB91",
        "#FF8A65",
        "#FF7043",
        "#FF5722",
        "#F4511E",
        "#E64A19",
        "#D84315",
        "#BF360C",
    )
    val deepOrangeLight = listOf(
        "#FF9E80",
        "#FF6E40",
        "#FF3D00",
        "#DD2C00",
    )

    val brown = listOf(
        "#EFEBE9",
        "#D7CCC8",
        "#BCAAA4",
        "#A1887F",
        "#8D6E63",
        " #795548",
        "#6D4C41",
        "#5D4037",
        "#4E342E",
        "#3E2723",
    )

    val gray = listOf(
        "#FAFAFA",
        "#F5F5F5",
        "#EEEEEE",
        "#E0E0E0",
        "#BDBDBD",
        "#9E9E9E",
        "#757575",
        "#616161",
        "#424242",
        "#212121",
    )

    val blueGray = listOf(
        "#ECEFF1",
        "#CFD8DC",
        "#B0BEC5",
        "#90A4AE",
        "#78909C",
        "#607D8B",
        "#546E7A",
        "#455A64",
        "#37474F",
        "#263238",
    )

    val black = listOf(
        "#000000"
    )

    val white = listOf(
        "#FFFFFF"
    )

    val palette: Map<Color, List<Color>> = hashMapOf(
        getColor(redOne.first()) to redOne.map { getColor(it) },
        getColor(redTwo.first()) to redTwo.map { getColor(it) },
        getColor(pink.first()) to pink.map { getColor(it) },
        getColor(pinktwo.first()) to pinktwo.map { getColor(it) },
        getColor(purple.first()) to purple.map { getColor(it) },
        getColor(purpleTwo.first()) to purpleTwo.map { getColor(it) },
        getColor(indigo.first()) to indigo.map { getColor(it) },
        getColor(indigoTwo.first()) to indigoTwo.map { getColor(it) },
        getColor(blue.first()) to blue.map { getColor(it) },
        getColor(blueTwo.first()) to blueTwo.map { getColor(it) },
        getColor(lightBlue.first()) to lightBlue.map { getColor(it) },
        getColor(cyan.first()) to cyan.map { getColor(it) },
        getColor(cyanLight.first()) to cyanLight.map { getColor(it) },
        getColor(teal.first()) to teal.map { getColor(it) },
        getColor(tealLight.first()) to tealLight.map { getColor(it) },
        getColor(green.first()) to green.map { getColor(it) },
        getColor(greenLight.first()) to greenLight.map { getColor(it) },
        getColor(greenLighter.first()) to greenLighter.map { getColor(it) },
        getColor(greenLighterLight.first()) to greenLighterLight.map { getColor(it) },
        getColor(lime.first()) to lime.map { getColor(it) },
        getColor(yellow.first()) to yellow.map { getColor(it) },
        getColor(yellowLight.first()) to yellowLight.map { getColor(it) },
        getColor(amber.first()) to amber.map { getColor(it) },
        getColor(amberLight.first()) to amberLight.map { getColor(it) },
        getColor(orange.first()) to orange.map { getColor(it) },
        getColor(orangeLight.first()) to orangeLight.map { getColor(it) },
        getColor(deepOrange.first()) to deepOrange.map { getColor(it) },
        getColor(deepOrangeLight.first()) to deepOrangeLight.map { getColor(it) },
        getColor(brown.first()) to brown.map { getColor(it) },
        getColor(blueGray.first()) to blueGray.map { getColor(it) }
    )

    val flatUniquePalette = TreeSet<Color> { color1, color2 -> color1.toArgb().compareTo(color2.toArgb()) }.apply {
        addAll(palette.values.flatten())
    }.toList()

    private fun Color.toRGBA(): FloatArray = floatArrayOf(red, green, blue, alpha)
}