package com.example.testwebviewapp

import androidx.lifecycle.ViewModel


class WebViewViewModel : ViewModel() {
    // Здесь вы можете поместить все необходимые данные и состояния, которые нужны WebViewFragment
    // В вашем случае это может быть, например, URL для загрузки в WebView.
    var urlToLoad: String = ""
}

