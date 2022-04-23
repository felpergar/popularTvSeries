package com.felipe.popularTvSeries.data.repository.tvseries.datasource

import com.felipe.popularTvSeries.data.common.ResultWrapper
import com.felipe.popularTvSeries.domain.tvseries.model.TvSerie
import com.felipe.popularTvSeries.domain.tvseries.model.TvSerieInfo
import com.felipe.popularTvSeries.domain.tvseries.usecase.GetPopularTvSeriesParams
import com.felipe.popularTvSeries.domain.tvseries.usecase.GetTvSerieInfoParams

interface TvSeriesDataSource {

  suspend fun getPopularTvSeries(params: GetPopularTvSeriesParams): ResultWrapper<List<TvSerie>>

  suspend fun getTvSerieInfo(params: GetTvSerieInfoParams): ResultWrapper<TvSerieInfo>
}