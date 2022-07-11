package kg.example.testtest

class Math {
    fun add(num: String, num2: String): String {
        var result = ""

        if (num.contains("-") || num2.contains("-")) {
            result = "отрицательные вводить нельзя"
        } else if (num.isEmpty() || num2.isEmpty()) {
            result = "пустоту нельзя прибавить"
        } else if (num.contains(".") || num2.contains(".")) {
            result = (num.toFloat() + num2.toFloat()).toString()
        } else if (num.contains(Regex("[a-z]")) || num2.contains (Regex("[a-z]"))) {
            result = "символы вводить нельзя"
        }
            else {
                result = (num.trim().toInt() + num2.trim().toInt()).toString()
            }
            return result
        }

        fun divide(num: String, num2: String): String {
            var result = ""
            if (num2 == "0") {
                result = "на ноль делить нельзя"
            }
            else if (num.isEmpty() || num2.isEmpty()) {
                result = "Пустоту нельзя прибавить"}
            else {
                result = (num.trim().toInt() / num2.trim().toInt()).toString()
            }
            return result
        }
    }