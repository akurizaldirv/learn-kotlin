package xyz.zaldev

import kotlin.reflect.KProperty

class DelegateGenericClass {
    private var value: Any? = null

    operator fun getValue(classRef: Any?, property: KProperty<*>): Any? {
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: Any?) {
        value = newValue
    }
}