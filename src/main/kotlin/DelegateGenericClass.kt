package xyz.zaldev

import kotlin.reflect.KProperty

class DelegateGenericClass<T>(private var value: T) {
    operator fun getValue(classRef: Any?, property: KProperty<*>): T {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: T) {
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}