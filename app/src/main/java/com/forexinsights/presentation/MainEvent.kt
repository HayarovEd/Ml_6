package com.forexinsights.presentation

import com.forexinsights.domain.model.StatusApplication
import com.forexinsights.domain.model.TypeCard
import com.forexinsights.domain.model.basedto.BaseState


sealed class MainEvent {
    object Reconnect: MainEvent()

    class OnChangeStatusApplication(val statusApplication: StatusApplication): MainEvent()
    class OnChangeBaseState(val baseState: BaseState): MainEvent()
    class OnChangeTypeCard(val typeCard: TypeCard): MainEvent()

    class OnGoToWeb(
        val urlOffer: String,
        val nameOffer: String
        ): MainEvent()
}
