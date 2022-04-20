package com.ashrafmohamed.model.model.basic

data class Text(
    val value: String,
    val fontSize: Int,
    val color: String,
    val letterSpacing: Int,
    val lineHeight: Int,
    val softWrap: Boolean = true,
    val maxLine: Int = Int.MAX_VALUE,
    val fontWeight: FontWeight,
    val fontFamily: FontFamily,
    val fontStyle: FontStyle,
    val textDecoration: TextDecoration,
    val textAlign: TextAlign,
    val overFlow: TextOverFLow,
    val textStyle: TextStyle,
)

data class TextStyle(
    val color: String,
    val fontSize: Int,
    val fontWeight: FontWeight?,
    val fontStyle: FontStyle?,
    val fontSynthesis: FontSynthesis?,
    val fontFamily: FontFamily?,
    val fontFeatureSettings: String?,
    val letterSpacing: Int,
    val background: String,
    val textDecoration: TextDecoration?,
    val textAlign: TextAlign?,
    val textDirection: TextDirection?,
    val lineHeight: TextUnit!,
    val textIndent: TextIndent?
)

enum class FontWeight {
    Black,
    Bold,
    ExtraBold,
    ExtraLight,
    Light,
    Medium,
    Normal,
    SemiBold,
    Thin,
    W100,
    W200,
    W300,
    W400,
    W500,
    W600,
    W700,
    W800,
    W900,
}

enum class FontFamily {
    Cursive,
    Default,
    Monospace,
    SansSerif,
    Serif
}

enum class TextDecoration {
    LineThrough,
    Underline,
    None,
}

enum class TextAlign {
    Center,
    Start,
    End,
    Left,
    Right,
    Justify
}

enum class TextOverFLow {
    Clip,
    Ellipsis,
    Visible
}

enum class FontStyle {
    Normal,
    Italic,
    Bold
}

enum class FontSynthesis {
    All,
    None,
    Style,
    Weight
}