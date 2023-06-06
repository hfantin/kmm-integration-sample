package com.github.hfantin.shared

import platform.Foundation.NSUUID

actual fun randomUUID(): String = NSUUID().UUIDString()