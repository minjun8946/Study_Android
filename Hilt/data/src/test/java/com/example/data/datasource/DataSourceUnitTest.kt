package com.example.data.datasource

import com.example.data.entity.BasicTeamData
import com.example.data.entity.MetaData
import com.example.data.entity.TeamBasicInfoData
import com.example.data.reomte.ApiService
import io.reactivex.Single
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations

class DataSourceUnitTest {
    lateinit var dataSource : DataSource

    @Mock
    lateinit var apiService: ApiService

    @Before
    fun beforeTest(){
        MockitoAnnotations.openMocks(this)
        dataSource = DataSourceImpl(apiService)

    }
    private val basicTeamData : List<BasicTeamData> =
        listOf(BasicTeamData(1,"lakers","Los","west","i don't know"),
            BasicTeamData(2,"Minjun","대전","중구","집")
        )
    private val metaData =MetaData(100,1)
    @Test
    fun dataSourceTest(){
        `when`(apiService.getTeamList()).thenReturn(Single.just(TeamBasicInfoData(basicTeamData,metaData)))
    }
}