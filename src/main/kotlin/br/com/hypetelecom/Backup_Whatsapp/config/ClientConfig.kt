package br.com.hypetelecom.Backup_Whatsapp.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.client.WebClient

@Configuration
class ClientConfig {

    @Bean
    fun whatsappClient(): WebClient{
        return WebClient.builder().baseUrl("https://graph.facebook.com/22.0").build()
    }

    @Bean
    fun microsoftClient(): WebClient{
        return WebClient.builder().baseUrl("https://graph.microsoft.com/v1.0/me/drive/root").build()
    }

    @Bean
    fun microsoftTokenClient(): WebClient{
        return WebClient.builder().baseUrl("https://login.microsoftonline.com/common/oauth2/v2.0").build()
    }

}