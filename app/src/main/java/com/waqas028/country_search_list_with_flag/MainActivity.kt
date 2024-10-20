package com.waqas028.country_search_list_with_flag

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.waqas028.country_search_list_with_flag.ui.theme.CountrySearchListWithFlagTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CountrySearchListWithFlagTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CountryListScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

fun languageToCountryList() = listOf(
    LanguageCountryData("Afrikaans", "af", "ZA", "South Africa"),
    LanguageCountryData("Arabic", "ar", "SA", "Saudi Arabia"),
    LanguageCountryData("Arabic", "ar", "EG", "Egypt"),
    LanguageCountryData("Arabic", "ar", "AE", "United Arab Emirates"),
    LanguageCountryData("Azerbaijani", "az", "AZ", "Azerbaijan"),
    LanguageCountryData("Bulgarian", "bg", "BG", "Bulgaria"),
    LanguageCountryData("Catalan", "ca", "ES", "Spain"),
    LanguageCountryData("Czech", "cs", "CZ", "Czech Republic"),
    LanguageCountryData("Danish", "da", "DK", "Denmark"),
    LanguageCountryData("German", "de", "DE", "Germany"),
    LanguageCountryData("German", "de", "AT", "Austria"),
    LanguageCountryData("Greek", "el", "GR", "Greece"),
    LanguageCountryData("English", "en", "GB", "United Kingdom"),
    LanguageCountryData("English", "en", "US", "United States"),
    LanguageCountryData("English", "en", "CA", "Canada"),
    LanguageCountryData("English", "en", "AU", "Australia"),
    LanguageCountryData("English", "en", "IN", "India"),
    LanguageCountryData("Spanish", "es", "ES", "Spain"),
    LanguageCountryData("Spanish", "es", "MX", "Mexico"),
    LanguageCountryData("Spanish", "es", "AR", "Argentina"),
    LanguageCountryData("Spanish", "es", "CO", "Colombia"),
    LanguageCountryData("Spanish", "es", "CL", "Chile"),
    LanguageCountryData("Finnish", "fi", "FI", "Finland"),
    LanguageCountryData("French", "fr", "FR", "France"),
    LanguageCountryData("French", "fr", "BE", "Belgium"),
    LanguageCountryData("French", "fr", "CA", "Canada"),
    LanguageCountryData("Hebrew", "he", "IL", "Israel"),
    LanguageCountryData("Hindi", "hi", "IN", "India"),
    LanguageCountryData("Hungarian", "hu", "HU", "Hungary"),
    LanguageCountryData("Indonesian", "id", "ID", "Indonesia"),
    LanguageCountryData("Italian", "it", "IT", "Italy"),
    LanguageCountryData("Japanese", "ja", "JP", "Japan"),
    LanguageCountryData("Korean", "ko", "KR", "South Korea"),
    LanguageCountryData("Lithuanian", "lt", "LT", "Lithuania"),
    LanguageCountryData("Latvian", "lv", "LV", "Latvia"),
    LanguageCountryData("Macedonian", "mk", "MK", "North Macedonia"),
    LanguageCountryData("Malay", "ms", "MY", "Malaysia"),
    LanguageCountryData("Norwegian", "no", "NO", "Norway"),
    LanguageCountryData("Dutch", "nl", "NL", "Netherlands"),
    LanguageCountryData("Polish", "pl", "PL", "Poland"),
    LanguageCountryData("Portuguese", "pt", "PT", "Portugal"),
    LanguageCountryData("Portuguese", "pt", "BR", "Brazil"),
    LanguageCountryData("Romanian", "ro", "RO", "Romania"),
    LanguageCountryData("Russian", "ru", "RU", "Russia"),
    LanguageCountryData("Serbian", "sr", "RS", "Serbia"),
    LanguageCountryData("Slovak", "sk", "SK", "Slovakia"),
    LanguageCountryData("Slovenian", "sl", "SI", "Slovenia"),
    LanguageCountryData("Swedish", "sv", "SE", "Sweden"),
    LanguageCountryData("Thai", "th", "TH", "Thailand"),
    LanguageCountryData("Turkish", "tr", "TR", "Turkey"),
    LanguageCountryData("Ukrainian", "uk", "UA", "Ukraine"),
    LanguageCountryData("Vietnamese", "vi", "VN", "Vietnam"),
    LanguageCountryData("Chinese", "zh", "CN", "China"),
    LanguageCountryData("Chinese", "zh", "TW", "Taiwan"),
    LanguageCountryData("Chinese", "zh", "HK", "Hong Kong"),
    LanguageCountryData("Persian", "fa", "IR", "Iran"),
    LanguageCountryData("Bengali", "bn", "BD", "Bangladesh"),
    LanguageCountryData("Bengali", "bn", "IN", "India"),
    LanguageCountryData("Urdu", "ur", "PK", "Pakistan"),
    LanguageCountryData("Urdu", "ur", "IN", "India"),
    LanguageCountryData("Pashto", "ps", "AF", "Afghanistan"),
    LanguageCountryData("Amharic", "am", "ET", "Ethiopia"),
    LanguageCountryData("Swahili", "sw", "KE", "Kenya"),
    LanguageCountryData("Swahili", "sw", "TZ", "Tanzania"),
    LanguageCountryData("Tagalog", "tl", "PH", "Philippines")
)

data class LanguageCountryData(
    val language: String,
    val languageCode: String,
    val countryCode: String,
    val countryName: String
)