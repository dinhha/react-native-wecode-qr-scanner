
# react-native-wecode-qr-scanner

## Getting started

`$ npm install react-native-wecode-qr-scanner --save`

### Mostly automatic installation

`$ react-native link react-native-wecode-qr-scanner`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-wecode-qr-scanner` and add `RNWecodeQrScanner.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNWecodeQrScanner.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNWecodeQrScannerPackage;` to the imports at the top of the file
  - Add `new RNWecodeQrScannerPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-wecode-qr-scanner'
  	project(':react-native-wecode-qr-scanner').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-wecode-qr-scanner/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-wecode-qr-scanner')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNWecodeQrScanner.sln` in `node_modules/react-native-wecode-qr-scanner/windows/RNWecodeQrScanner.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Com.Reactlibrary.RNWecodeQrScanner;` to the usings at the top of the file
  - Add `new RNWecodeQrScannerPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNWecodeQrScanner from 'react-native-wecode-qr-scanner';

// TODO: What to do with the module?
RNWecodeQrScanner;
```
  