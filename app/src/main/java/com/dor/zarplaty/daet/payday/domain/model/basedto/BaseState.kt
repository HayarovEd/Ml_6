package com.dor.zarplaty.daet.payday.domain.model.basedto

import com.dor.zarplaty.daet.payday.domain.model.TypeCard

sealed class BaseState{
    object Loans: BaseState()
    class Cards(val typeCard: TypeCard): BaseState()
    object Credits: BaseState()
}
