'use strict';

import React, {
  Component,
  PropTypes,
} from 'react';
import {
  requireNativeComponent,
  StyleSheet,
  View,
} from 'react-native';

class WeCodeQRScannerView extends Component{
  constructor(props) {
    super(props);

    this.onChange = this.onChange.bind(this);
  }

  onChange(event) {
    if (!this.props.onQRCodeRead) {
      return;
    }

    console.log("WeCodeQRScannerView", event);

    // this.props.onQRCodeRead({
    //   type: event.nativeEvent.type,
    //   data: event.nativeEvent.data,
    // });
  }

  render(){
    return (
      <RNWecodeQRScannerView {...this.props} onChange={this.onChange}></RNWecodeQRScannerView>
    );
  }
}

WeCodeQRScannerView.propTypes = {
  ...View.propTypes,
  onQRCodeRead: PropTypes.func
};

const RNWecodeQRScannerView = requireNativeComponent('RNWecodeQRScannerView', WeCodeQRScannerView, {
  nativeOnly: {onChange: true}
});

export default WeCodeQRScannerView;
