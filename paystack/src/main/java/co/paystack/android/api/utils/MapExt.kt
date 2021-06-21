package co.paystack.android.api.utils

@Suppress("UNCHECKED_CAST")
fun <K, V> Map<K, V?>.pruneNullValues(): Map<K, V> {
    return filter { it.value != null } as Map<K, V>
}