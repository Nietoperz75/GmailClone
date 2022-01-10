package eu.tutorials.gmailclone

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class DrawerMenuData(
    val icon:ImageVector? = null,
    val title: String? = null,
    val isDivider: Boolean = false,
    val isHeader: Boolean = false
){
    object AllInboxes: DrawerMenuData(
        icon = Icons.Outlined.AllInbox,
        title = "All inboxes"
    )
    object Primary:DrawerMenuData(
        icon = Icons.Outlined.Inbox,
        title = "Primary"
    )
    object Social: DrawerMenuData(
        icon = Icons.Outlined.Person,
        title = "Social"
    )
    object Important:DrawerMenuData(
        icon = Icons.Outlined.Send,
        title = "Important"
    )
    object Sent:DrawerMenuData(
        icon = Icons.Outlined.Send,
        title = "Sent"
    )
    object Schedule:DrawerMenuData(
        icon = Icons.Outlined.Schedule,
        title = "Scheduled"
    )
    object Outbox: DrawerMenuData(
        icon = Icons.Outlined.Outbox,
        title = "Outbox"
    )

    object Settings:DrawerMenuData(
        icon = Icons.Outlined.Settings,
        title = "Settings"
    )
    object Help:DrawerMenuData(
        icon = Icons.Outlined.Help,
        title = "Help"
    )

    object Divider:DrawerMenuData(
        isDivider = true
    )
    object HeaderOne:DrawerMenuData(
        isHeader = true,
        title = "ALL LABELS"
    )

    object HeaderTwo:DrawerMenuData(
        isHeader = true,
        title = "GOOGLE APPS"
    )
}
