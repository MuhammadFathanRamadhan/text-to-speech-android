## Text-to-Speech Android

A simple Android application that demonstrates text-to-speech functionality using Android's built-in Text-to-Speech (TTS) engine. This app allows users to input text and convert it into spoken audio, with options to adjust speech parameters like rate and pitch.

## Features

- **Text Input and Speech Conversion**: Users can enter text in an EditText field and trigger speech synthesis with a button press.
- **Speech Parameter Adjustment**: Sliders or seek bars to modify speech rate (0.5x to 2.0x) and pitch (0.5 to 2.0).
- **Engine Selection**: Option to choose from available TTS engines on the device (e.g., Google TTS).
- **Language and Locale Support**: Dynamically lists and allows selection of supported languages/locales.
- **Playback Controls**: Play, pause, and stop functionality for ongoing speech.
- **Error Handling**: Displays toast messages for TTS initialization failures or unsupported features.
- **Minimal UI**: Built with Android Views (no external libraries for core functionality), featuring a simple layout with buttons, text fields, and progress indicators.

## Requirements

- Android Studio (latest version recommended)
- Minimum Android API Level: 21 (Android 5.0 Lollipop)
- Device with TTS engine installed (most Android devices have this by default)

## Installation

1. Clone the repository:
   ```
   git clone https://github.com/MuhammadFathanRamadhan/text-to-speech-android.git
   ```

2. Open the project in Android Studio.

3. Sync the project with Gradle files.

4. Build and run the app on an Android device or emulator.

## Usage

1. **Launch the App**: Open the app on your device.
2. **Enter Text**: Type or paste text into the input field (e.g., `MainActivity.kt` has an EditText with ID `editText`).
3. **Configure Settings**:
   - Adjust rate using a SeekBar (ID: `seekBarRate`).
   - Adjust pitch using another SeekBar (ID: `seekBarPitch`).
   - Select language from a Spinner (ID: `spinnerLanguages`).
4. **Speak**: Tap the "Speak" button (ID: `buttonSpeak`) to initiate TTS.
5. **Control Playback**: Use "Pause" and "Stop" buttons for ongoing speech.
6. **Handle Errors**: If TTS fails to initialize, a toast will notify you (check `onInit` method in `MainActivity.kt`).

A lightweight Android application that leverages the Android Text-to-Speech (TTS) API to convert user-inputted text into audible speech. This project demonstrates basic TTS integration, allowing customization of speech parameters and handling of TTS engine initialization and errors.

## Tech Stack

- **Language**: Kotlin (or Java, based on repo files)
- **API**: Android TextToSpeech API (android.speech.tts.TextToSpeech)
- **Minimum SDK**: API 21 (Android 5.0)
- **Target SDK**: API 33 (Android 13)
- **Build Tool**: Gradle
- **Dependencies**: None (uses only Android SDK)

## Acknowledgments

- Utilizes Android's native TTS capabilities for reliability.
- Inspired by Android developer documentation on Text-to-Speech.
- For issues or feature requests, visit the [GitHub Issues](https://github.com/MuhammadFathanRamadhan/text-to-speech-android/issues) page.
