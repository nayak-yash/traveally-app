package com.ash.traveally.ui.components.text

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.ash.traveally.R

@Composable
fun PhoneNumberTextField(
    modifier: Modifier = Modifier,
    value: String = "",
    isError: Boolean = false,
    onValueChange: (String) -> Unit
) {
    AppTextField(
        value = value,
        label = "Phone number",
        onValueChange = onValueChange,
        modifier = modifier,
        leadingIcon = { Icon(Icons.Outlined.Phone, "Phone") },
        isError = isError,
        helperText = stringResource(R.string.message_field_phone_number_invalid)
    )
}