package net.sf.l2j.cms.models

fun Map<String, Any>.getField(fieldName: String): Any {
    return this[fieldName] ?: throw IllegalArgumentException("Invalid field name")
}