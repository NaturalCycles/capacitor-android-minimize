import { WebPlugin } from '@capacitor/core';
import { AndroidMinimizePlugin } from './definitions';

export class AndroidMinimizeWeb extends WebPlugin implements AndroidMinimizePlugin {
  constructor() {
    super({
      name: 'AndroidMinimize',
      platforms: ['web']
    });
  }

  minimizeApp() {}
}

const AndroidMinimize = new AndroidMinimizeWeb();

export { AndroidMinimize };

import { registerWebPlugin } from '@capacitor/core';
registerWebPlugin(AndroidMinimize);
