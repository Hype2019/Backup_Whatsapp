package br.com.hypetelecom.Backup_Whatsapp.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpHeaders
import org.springframework.web.reactive.function.client.WebClient

@Configuration
class ClientConfig {

    private val testToken = "867830" /* random numbers, don´t has access for clients*/

    @Bean
    fun whatsappClient(): WebClient{
        return WebClient.builder().baseUrl("https://graph.facebook.com/22.0").defaultHeader(HttpHeaders.AUTHORIZATION, "Baerer ${testToken}").build()
    }

    @Bean
    fun microsoftClient(): WebClient{
        return WebClient.builder().baseUrl("https://graph.microsoft.com/v1.0/me/drive/root").defaultHeader(HttpHeaders.AUTHORIZATION, "Barer ${testToken}").build()
    }

    @Bean
    fun microsoftTokenClient(): WebClient{
        return WebClient.builder().baseUrl("https://login.microsoftonline.com/common/oauth2/v2.0").defaultHeader(HttpHeaders.AUTHORIZATION, "Baerer ${testToken}").build()
    }

}