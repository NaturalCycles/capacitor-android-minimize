
  Pod::Spec.new do |s|
    s.name = 'AndroidMinimize'
    s.version = '0.0.1'
    s.summary = 'Minimize Android app'
    s.license = 'MIT'
    s.homepage = ''''
    s.author = ''
    s.source = { :git => '''', :tag => s.version.to_s }
    s.source_files = 'ios/Plugin/**/*.{swift,h,m,c,cc,mm,cpp}'
    s.ios.deployment_target  = '11.0'
    s.dependency 'Capacitor'
  end