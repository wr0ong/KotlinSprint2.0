package org.example.lesson22

class ViewModel(var mainScreenState: MainScreenState) {
    data class MainScreenState(var data: String = "", val isLoading: Boolean = false)

    fun loadData(): MainScreenState {
        var newScreenState = MainScreenState()
        println("Данных нет, начать загрузку?")
        val startOrNot: String = readln()
        if ((startOrNot == "Да") || (startOrNot == "да") || (startOrNot == "yes") || (startOrNot == "Yes")) {
            println("Данные загружаются...")
            newScreenState = MainScreenState().copy(
                isLoading = true,
                data = "Данные главного экрана: \n main screen: <?версия xml=\"1.0\" кодировка=\"utf-8\"?>\n" +
                        "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "    android:id=\"@+id/LinearLayout01\"\n" +
                        "    android:layout_width=\"200dp\"\n" +
                        "    android:layout_height=\"75dp\"\n" +
                        "    android:background=\"@drawable/shape\"\n" +
                        "    android:orientation=\"horizontal\" >\n" +
                        "    <Кнопка android:id=\"@+id/обновить\"\n" +
                        "        android:layout_width=\"30dp\"\n" +
                        "        android:layout_height=\"fill_parent\"\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:layout_alignParentLeft=\"true\""
            )
            Thread.sleep(1500)
            newScreenState.data += "android:text=\"Обновить\"\n" +
                    "        android:textSize=\"3pt\" />\n" +
                    "    <LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "        android:id=\"@+id/LinearLayout01\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"fill_parent\"\n" +
                    "        android:background=\"@drawable/shape\"\n" +
                    "        android:orientation=\"vertical\" >\n" +
                    "        <TextView android:id =\"@+id/ssid\"\n" +
                    "            android:layout_width=\"wrap_content\"\n" +
                    "            android:layout_height=\"wrap_content\"\n" +
                    "            android:gravity=\"center_horizontal\"\n" +
                    "            android:text=\"SSID\"\n" +
                    "            android:textColor=\"#333333\"\n" +
                    "            android:textSize=\"5pt\"\n" +
                    "            android:layout_weight=\"1\" />"
            Thread.sleep(1500)
            newScreenState.data += "<TextView android:id=\"@+id/wifiip\"\n" +
                    "            android:layout_width=\"wrap_content\"\n" +
                    "            android:layout_height=\"wrap_content\"\n" +
                    "            android:gravity=\"center_horizontal\"\n" +
                    "            android:text=\"IP-адрес\"\n" +
                    "            android:textColor=\"#333333\"\n" +
                    "            android:textSize=\"5pt\"\n" +
                    "            android:layout_weight=\"1\" />\n" +
                    "        <TextView android:id=\"@+id/extip\"\n" +
                    "            android:layout_width=\"wrap_content\"\n" +
                    "            android:layout_height=\"wrap_content\"\n" +
                    "            android:layout_below=\"@+id/ssid\"\n" +
                    "            android:text=\"WAN IP\"\n" +
                    "            android:textColor=\"#333333\"\n" +
                    "            android:textSize=\"5pt\"\n" +
                    "            android:layout_weight=\"1\" />\n" +
                    "    </LinearLayout>\n" +
                    "</LinearLayout>"
            println("Данные загружены!")
            newScreenState = newScreenState.copy(isLoading = false)
        }
        return newScreenState
    }
}


fun main() {
    val mainScreenState = ViewModel.MainScreenState()
    val viewModel = ViewModel(mainScreenState)
    viewModel.mainScreenState = viewModel.loadData()
}