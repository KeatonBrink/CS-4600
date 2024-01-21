import androidx.annotation.StringRes


// @StringRes tells the compiler to expect a string resource id
// While a string will be displayed, the int is only the id for the string
data class Question(@StringRes val textResId: Int, val answer: Boolean)