using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Com.Reactlibrary.RNWecodeQrScanner
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNWecodeQrScannerModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNWecodeQrScannerModule"/>.
        /// </summary>
        internal RNWecodeQrScannerModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNWecodeQrScanner";
            }
        }
    }
}
