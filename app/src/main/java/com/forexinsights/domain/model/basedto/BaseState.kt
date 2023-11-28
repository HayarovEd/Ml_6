package com.forexinsights.domain.model.basedto

import com.forexinsights.domain.model.TypeCard

sealed class BaseState{
    object Loans: BaseState()
    class Cards(val typeCard: TypeCard): BaseState()
    object Credits: BaseState()
}
