# 🌍 Language & Country Selector with Flags and Material 3 Search Bar

This project allows you to implement a country and language selector in your Android app without needing to manually import flags into the resource files. Just pass the country code, and you'll get the appropriate flag. The Material 3 (M3) Search Bar lets users search by language name, language code, country code, or country name.
## ✨ Features
- **Dynamic Flags**: Automatically get the correct flag for each country by passing its country code. No need to manually add flag resources!
- **Efficient Search**: Use the M3 Search Bar to filter and search by:
  - Language Name (e.g., "English")
  - Language Code (e.g., "en")
  - Country Code (e.g., "US")
  - Country Name (e.g., "United States")

# Demo Video

https://github.com/user-attachments/assets/12e20426-8eff-490b-9391-3c2ea72b5daa



## Get Country Flags
You can dynamically show the flag of a country using just its country code. Here’s how you can do it in your code:
```kotlin
//Example: countryCode = "pk" //Pakistan
fun localeToEmoji(countryCode: String): String {
    val firstLetter = Character.codePointAt(countryCode, 0) - 0x41 + 0x1F1E6
    val secondLetter = Character.codePointAt(countryCode, 1) - 0x41 + 0x1F1E6
    return String(Character.toChars(firstLetter)) + String(Character.toChars(secondLetter))
}
```
## Usage
```kotlin
val pakistanFlag = getCountryFlag("PK") // Output: 🇵🇰
```
- This method converts a two-letter country code (ISO 3166-1) into the corresponding flag emoji. For example, "US" returns 🇺🇸, "GB" returns 🇬🇧, etc.

## M3 Search Bar with Language & Country List
The M3 Search Bar allows you to search through the list of languages and countries using multiple criteria. It supports search by language name, country code, language code, and country name.
```kotlin
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBarSample() {
    var expanded by rememberSaveable { mutableStateOf(false) }
    var query by rememberSaveable { mutableStateOf("") }
    var filteredList by rememberSaveable { mutableStateOf(emptyList<LanguageCountryData>()) }

    // Filter list based on query
    LaunchedEffect(query) {
        filteredList = filterList(query)
    }

    Box(
        Modifier.semantics { isTraversalGroup = true }
    ) {
        SearchBar(
            inputField = {
                SearchBarDefaults.InputField(
                    query = query,
                    onQueryChange = { query = it },  // Update the query as user types
                    onSearch = { expanded = false },
                    expanded = expanded,
                    onExpandedChange = { expanded = it },
                    placeholder = { Text("Search language or country...") },
                    leadingIcon = { Icon(Icons.Default.Search, contentDescription = null) },
                    trailingIcon = {
                        Icon(
                            Icons.Default.Close,
                            contentDescription = "Clear search",
                            modifier = Modifier.clickable {
                                query = ""
                                expanded = false
                            }
                        )
                    },
                )
            },
            expanded = expanded,
            onExpandedChange = { expanded = it },
            modifier = Modifier
                .align(Alignment.TopCenter)
                .semantics { traversalIndex = 0f },
            shape = RoundedCornerShape(40.dp),
            colors = SearchBarDefaults.colors(
                containerColor = Color.LightGray,
                dividerColor = Color.Black,
            ),
            tonalElevation = 10.dp,
            shadowElevation = 10.dp,
        ) {
            // Display filtered list in LazyColumn
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                items(filteredList) { languageCountry ->
                    LanguageCountryCard(languageCountry)
                }
            }
        }
    }
}
```
## 💡 How It Works
- **Dynamic Flags**: The getCountryFlag function generates the correct flag for a country using its two-letter country code. The flag is displayed using emoji characters.
- **Search Filtering**: The Material 3 Search Bar filters through the list using multiple criteria (language name, country code, language code, country name).

## 🙌 Contributions
Feel free to fork the repo and create pull requests for any improvements or additional features. We appreciate your contributions!

## Contact

For any inquiries, please contact waqaswaseem679@gmail.com.
