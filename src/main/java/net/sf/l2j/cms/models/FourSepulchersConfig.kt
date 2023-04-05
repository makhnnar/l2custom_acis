package net.sf.l2j.cms.models

import net.sf.l2j.Config

data class FourSepulchersConfig(
    var FS_TIME_ENTRY: Int = Config.FS_TIME_ENTRY,
    var FS_TIME_END: Int = Config.FS_TIME_END,
    var FS_PARTY_MEMBER_COUNT: Int = Config.FS_PARTY_MEMBER_COUNT
) {
    companion object {
        val fieldMap = mapOf(
            "FS_TIME_ENTRY" to Config::FS_TIME_ENTRY,
            "FS_TIME_END" to Config::FS_TIME_END,
            "FS_PARTY_MEMBER_COUNT" to Config::FS_PARTY_MEMBER_COUNT
        )
    }
}