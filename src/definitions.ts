declare module "@capacitor/core" {
  interface PluginRegistry {
    AndroidMinimize: AndroidMinimizePlugin;
  }
}

export interface AndroidMinimizePlugin {
  minimizeApp(): void;
}
