[![BCH compliance](https://bettercodehub.com/edge/badge/tperraut/gilded-rose-test?branch=master)](https://bettercodehub.com/)
[![codecov](https://codecov.io/gh/tperraut/gilded-rose-test/branch/master/graph/badge.svg)](https://codecov.io/gh/tperraut/gilded-rose-test)
[![Build Status](https://travis-ci.com/tperraut/gilded-rose-test.svg?branch=master)](https://travis-ci.com/tperraut/gilded-rose-test)

# gilded-rose-test
This repo is a Kotlin refactor of [GildedRose-Refactoring-Kata](https://github.com/emilybache/GildedRose-Refactoring-Kata)

## How to build

Use the command `./gradlew build`. After that you can find the file `gilded-rose-test.jar` in the `build/libs` folder

## How to use

Use the command `./gradlew test` to run the tests.

You can also import the `.jar` file available in the build folder as a lib in your Java or Kotlin project and create a
custom main to test it.

Another solution is to clone the project, open it with Intellij or any other IDE that can deal with Kotlin and use the
test main inside TexttestFixture provided in the kata base.

> Note : I did not provide any main file myself as this kata is refactoring exercise, I did it with a TDD approach and
> used the provided test main.

## License

MIT License

Copyright (c) 2020 Thomas Perraut

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.