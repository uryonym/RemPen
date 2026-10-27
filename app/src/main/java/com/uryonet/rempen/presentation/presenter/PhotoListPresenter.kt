package com.uryonet.rempen.presentation.presenter

import com.uryonet.rempen.domain.service.PhotoService
import com.uryonet.rempen.presentation.contract.PhotoListContract

class PhotoListPresenter(override val view: PhotoListContract.View?) : PhotoListContract.Presenter {

    private val photoService = PhotoService()

    override fun getPhotoList() {
        photoService
    }

}
