package com.gralliams.labari.models

import androidx.room.Entity
import androidx.room.PrimaryKey

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)

@Entity(
    tableName = "articles"
)
data class Article(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val author: String,
    val content: String,
    val description: String,
    val publishedAt: String,
    val source: Source,
    val title: String,
    val url: String,
    val urlToImage: String
)

data class Source(
    val id: String,
    val name: String
)


//{"status":"ok","totalResults":38,
// "articles":[{"source":{"id":"google-news","name":"Google News"},
// "author":null,
// "title":"New data reveals Nigeria as country with highest number of HIV/AIDS children in the world - The Streetjournal",
// "description":null,
// "url":"https://news.google.com/__i/rss/rd/articles/CBMid2h0dHBzOi8vdGhlc3RyZWV0am91cm5hbC5vcmcvbmV3LWRhdGEtcmV2ZWFscy1uaWdlcmlhLWFzLWNvdW50cnktd2l0aC1oaWdoZXN0LW51bWJlci1vZi1oaXYtYWlkcy1jaGlsZHJlbi1pbi10aGUtd29ybGQv0gEA?oc=5",
// "urlToImage":null,
// "publishedAt":"2021-11-29T06:30:16Z",
// "content":null},
// {"source":{"id":"google-news","name":"Google News"},
// "author":null,
// "title":"INEC: Tension mounts over replacement as 5 nat’l commissioners retire next week - Vanguard",
// "description":null,
// "url":"https://news.google.com/__i/rss/rd/articles/CBMicmh0dHBzOi8vd3d3LnZhbmd1YXJkbmdyLmNvbS8yMDIxLzExL2luZWMtdGVuc2lvbi1tb3VudHMtb3Zlci1yZXBsYWNlbWVudC1hcy01LW5hdGwtY29tbWlzc2lvbmVycy1yZXRpcmUtbmV4dC13ZWVrL9IBdmh0dHBzOi8vd3d3LnZhbmd1YXJkbmdyLmNvbS8yMDIxLzExL2luZWMtdGVuc2lvbi1tb3VudHMtb3Zlci1yZXBsYWNlbWVudC1hcy01LW5hdGwtY29tbWlzc2lvbmVycy1yZXRpcmUtbmV4dC13ZWVrL2FtcC8?oc=5",
// "urlToImage":null,
// "publishedAt":"2021-11-29T06:30:00Z",
// "content":null},{"source":{"id":null,"name":"Nairametrics"},"author":"William Ukpe","title":"2 persons returning from Nigeria have Omicron variant of COVID-19 - Canadian Government - Nairametrics - Nairametrics","description":"Two people returning from Nigeria have contacted the Omicron variant of the Covid-19 virus, according to the Canadian government. This","url":"https://nairametrics.com/2021/11/29/2-persons-returning-from-nigeria-have-omicron-variant-of-covid-19-canadian-government/","urlToImage":"https://i0.wp.com/nairametrics.com/wp-content/uploads/2021/02/COVID-19-test.jpg?fit=900%2C506&ssl=1","publishedAt":"2021-11-29T06:09:06Z","content":"Two people returning from Nigeria have contacted the Omicron variant of the Covid-19 virus, according to the Canadian government.\r\nThis was disclosed by the Province of Ontario, as Canada begins clos… [+1027 chars]"},{"source":{"id":null,"name":"NDTV News"},"author":"Nithya P Nair","title":"Vivo Y55s Price, Specifications, Launch Date Tipped via China Telecom Listing - NDTV","description":"Vivo Y55s has been spotted in a China Telecom listing ahead of an official announcement from the company. As per the listing, the handset features a waterdrop-style notch display, dual rear cameras, and a 6,000mAh battery. Vivo Y55s price is CNY 1,899 (roughl…","url":"https://gadgets.ndtv.com/mobiles/news/vivo-y55s-price-cny-1899-launch-date-december-4-specifications-renders-leak-china-telecom-listing-2628859","urlToImage":"https://i.gadgets360cdn.com/large/vivo_y55s_china_telecom_listing_1638165678534.jpg","publishedAt":"2021-11-29T06:08:09Z","content":"Vivo Y55s has been spotted in a China Telecom listing, hinting at an imminent launch of the smartphone in the country. The listing shows renders of the phone as well as its key specifications. The ne… [+1832 chars]"},{"source":{"id":null,"name":"YouTube"},"author":null,"title":"Jussie Smollet criminal trial to begin this week - Sky News Australia","description":"The criminal trial for US actor Jussie Smollett is set to commence on Monday, local time, after an almost three year delay.Mr Smollett is charge with six cou...","url":"https://www.youtube.com/watch?v=q2zWucgHMdY","urlToImage":"https://i.ytimg.com/vi/q2zWucgHMdY/maxresdefault.jpg","publishedAt":"2021-11-29T05:42:47Z","content":null},{"source":{"id":null,"name":"Spaceflight Now"},"author":null,"title":"NASA gives green light to fuel James Webb Space Telescope – Spaceflight Now - Spaceflight Now","description":null,"url":"https://spaceflightnow.com/2021/11/28/nasa-gives-green-light-to-fuel-james-webb-space-telescope/","urlToImage":null,"publishedAt":"2021-11-29T05:26:42Z","content":"The James Webb Space Telescope inside a clean room at the Guiana Space Center. Credit: Stephen Clark / Spaceflight Now\r\nNASA engineers have cleared teams at the Guiana Space Center in South America t… [+4880 chars]"},{"source":{"id":null,"name":"Digital Trends"},"author":"Trevor Mogg","title":"Recently returned astronaut shares stunning photos of Earth - Digital Trends","description":"An astronaut who recently returned from the ISS is continuing to share new and amazing images of Earth that he captured during his six-month mission.","url":"https://www.digitaltrends.com/photography/earth-based-astronaut-still-sharing-amazing-planet-pics/","urlToImage":"https://icdn.digitaltrends.com/image/digitaltrends/africa-landscape-from-iss.jpg","publishedAt":"2021-11-29T05:15:58Z","content":"During his most recent six-month stint on the International Space Station (ISS), astronaut Thomas Pesquet earned a reputation for taking sublime photos of Earth 250 miles below.\r\nPesquet returned fro… [+3069 chars]"},{"source":{"id":"techradar","name":"TechRadar"},"author":"Olivia Tambini","title":"Bose QuietComfort Earbuds plummet to lowest price in Cyber Monday deal - TechRadar","description":"The best noise-cancelling earbuds just got cheaper","url":"https://www.techradar.com/news/bose-quietcomfort-earbuds-plummet-to-lowest-price-in-cyber-monday-deal","urlToImage":"https://cdn.mos.cms.futurecdn.net/XuN5zWEPVwWHQxF8QXuXiG-1200-80.jpg","publishedAt":"2021-11-29T04:38:48Z","content":"The best noise-cancelling earbuds you can buy in 2021 have been giving a stellar discount for Cyber Monday, returning to the lowest price we've ever seen. \r\nThe Bose QuietComfort Earbuds are currentl… [+3763 chars]"},{"source":{"id":null,"name":"Premium Times"},"author":"Ronald Adamolekun","title":"Documents reveal Seplat chairman ABC Orjiako's role in Malabu scandal - Premium Times","description":"The Seplat chairman helped negotiate payment for the lucrative oil block and in the end, his firm took a slice of the huge pay-out.","url":"https://www.premiumtimesng.com/news/headlines/497492-documents-reveal-seplat-chairman-abc-orjiakos-role-in-malabu-scandal.html","urlToImage":"https://i1.wp.com/media.premiumtimesng.com/wp-content/files/2021/11/1633368269003blob-e1637934205268.png?fit=600%2C486&ssl=1","publishedAt":"2021-11-29T04:32:18Z","content":"Ambroise Orjiako played the role of a top adviser to Dan Etete in the infamous Malabu scandal, in which the Nigerian government controversially handed a lucrative oil field to Mr Etete, who sold it t… [+7217 chars]"},{"source":{"id":"google-news","name":"Google News"},"author":null,"title":"#EndSARS panel was illegal, says Keyamo - The Nation Newspaper","description":null,"url":"https://news.google.com/__i/rss/rd/articles/CBMiRGh0dHBzOi8vdGhlbmF0aW9ub25saW5lbmcubmV0L2VuZHNhcnMtcGFuZWwtd2FzLWlsbGVnYWwtc2F5cy1rZXlhbW8v0gFIaHR0cHM6Ly90aGVuYXRpb25vbmxpbmVuZy5uZXQvZW5kc2Fycy1wYW5lbC13YXMtaWxsZWdhbC1zYXlzLWtleWFtby9hbXAv?oc=5","urlToImage":null,"publishedAt":"2021-11-29T04:18:18Z","content":null},{"source":{"id":null,"name":"Sports Mole"},"author":"Matt Law","title":"Michael Carrick: 'Benching Cristiano Ronaldo my decision, not Ralf Rangnick's' - Sports Mole","description":"Michael Carrick says that he made the decision to bench Cristiano","url":"https://www.sportsmole.co.uk/football/man-utd/news/carrick-benching-ronaldo-my-decision-not-rangnicks_471397.html","urlToImage":"//b.smimg.net/21/45/640x480/cristiano-ronaldo.jpg","publishedAt":"2021-11-29T04:05:57Z","content":"Ronaldo was surprisingly left out of the starting XI at Stamford Bridge, with the Red Devils instead lining up with Bruno Fernandes in an attacking area alongside Jadon Sancho and Marcus Rashford.\r\nT… [+1058 chars]"},{"source":{"id":null,"name":"Guardian Nigeria"},"author":null,"title":"Omicron, return of travel bans dampen oil future, air travel - Guardian Nigeria","description":"With travel restrictions being reinstated against a number of countries in southern Africa by the United Kingdom, United States of America","url":"https://guardian.ng/news/omicron-return-of-travel-bans-dampen-oil-future-air-travel/","urlToImage":"https://guardian.ng/wp-content/uploads/2021/11/000_9TH2M2-scaled.jpg","publishedAt":"2021-11-29T03:54:00Z","content":"With travel restrictions being reinstated against a number of countries in southern Africa by the United Kingdom, United States of America and Singapore, among others, as well as the European Union (… [+12806 chars]"},{"source":{"id":"google-news","name":"Google News"},"author":null,"title":"How hoodlums, motorists, others scooping fuel led to Ogun tanker explosion - Vanguard","description":null,"url":"https://news.google.com/__i/rss/rd/articles/CBMibWh0dHBzOi8vd3d3LnZhbmd1YXJkbmdyLmNvbS8yMDIxLzExL2hvdy1ob29kbHVtcy1tb3RvcmlzdHMtb3RoZXJzLXNjb29waW5nLWZ1ZWwtbGVkLXRvLW9ndW4tdGFua2VyLWV4cGxvc2lvbi_SAXFodHRwczovL3d3dy52YW5ndWFyZG5nci5jb20vMjAyMS8xMS9ob3ctaG9vZGx1bXMtbW90b3Jpc3RzLW90aGVycy1zY29vcGluZy1mdWVsLWxlZC10by1vZ3VuLXRhbmtlci1leHBsb3Npb24vYW1wLw?oc=5","urlToImage":null,"publishedAt":"2021-11-29T03:51:47Z","content":null},{"source":{"id":null,"name":"Guardian Nigeria"},"author":null,"title":"Don't overburden us, Nigerians warn FG on fuel subsidy - Guardian Nigeria","description":"More reactions, yesterday, denounced the planned removal of petroleum subsidy and introduction of N5,000 transportation subsidy","url":"https://guardian.ng/news/dont-overburden-us-nigerians-warn-fg-on-fuel-subsidy/","urlToImage":"https://guardian.ng/wp-content/uploads/2019/12/1280.jpg","publishedAt":"2021-11-29T03:49:00Z","content":"PFN: Subsidy removal will worsen Nigerians sufferingCAN: Engage stakeholders before withdrawalN5,000 palliative huge disgrace, naira becoming useless, says Anglican bishopCatholic knights: Stop subsi… [+9546 chars]"},{"source":{"id":null,"name":"Guardian Nigeria"},"author":null,"title":"Buhari has turned Nigeria into beggar nation, PDP chairman alleges - Guardian Nigeria","description":"Chairman of the Peoples Democratic Party (PDP), Dr. Iyorchia Ayu, has said foreign loans taken under the administration of Buhari","url":"https://guardian.ng/news/buhari-has-turned-nigeria-into-beggar-nation-pdp-chairman-alleges/","urlToImage":"https://guardian.ng/wp-content/uploads/2018/01/Iyorchia-Ayu.jpg","publishedAt":"2021-11-29T03:10:00Z","content":"Opposition party cant rescue the nation, Okechukwu insistsAPC youths list benefits of direct primaries\r\nChairman of the Peoples Democratic Party (PDP), Dr. Iyorchia Ayu, has said foreign loans taken … [+3731 chars]"},{"source":{"id":null,"name":"Guardian Nigeria"},"author":null,"title":"NDLEA arrests 70-year-old woman, others for seized 6586kg narcotics - Guardian","description":"Over 50 narcotic officers on Saturday seized 12,385 kilogrammes of Loud Cannabis, a strong variant of the illicit weed imported","url":"https://guardian.ng/news/ndlea-arrests-70-year-old-woman-others-for-seized-6586kg-narcotics/","urlToImage":"https://guardian.ng/wp-content/uploads/2021/11/NDLEA.jpg","publishedAt":"2021-11-29T03:05:00Z","content":"Intercepts 7 12,385kg drugs smuggled into Lagos on waterways\r\nOver 50 narcotic officers on Saturday seized 12,385 kilogrammes of Loud Cannabis, a strong variant of the illicit weed imported from a ne… [+3206 chars]"},{"source":{"id":null,"name":"Guardian Nigeria"},"author":null,"title":"Take advantage of capital market master plan, Finance Minister charges investors - Guardian Nigeria","description":"Capital market investors have been urged to take advantage of initiatives introduced in the capital market master plan to deepen knowledge","url":"https://guardian.ng/business-services/take-advantage-of-capital-market-master-plan-finance-minister-charges-investors/","urlToImage":"https://guardian.ng/wp-content/uploads/2021/10/Zainab-Ahmed.jpg","publishedAt":"2021-11-29T02:59:00Z","content":"Capital market investors have been urged to take advantage of initiatives introduced in the capital market master plan to deepen knowledge in market fundamentals.\r\nMinister of Finance, Budget and Nat… [+2132 chars]"},{"source":{"id":null,"name":"Guardian Nigeria"},"author":null,"title":"Oando, FBNH, GTCO contribute 66.5% to market turnover — Business — The Guardian Nigeria News – Nigeria and World News - Guardian Nigeria","description":"High transactions in the shares of Oando, FBN Holdings and Guaranty Trust Holding Company (GTCO) lifted the volume of shares traded","url":"https://guardian.ng/business-services/oando-fbnh-gtco-contribute-66-5-to-market-turnover/","urlToImage":"https://guardian.ng/wp-content/uploads/2019/06/Oando-750x375.jpg","publishedAt":"2021-11-29T02:55:00Z","content":"High transactions in the shares of Oando, FBN Holdings and Guaranty Trust Holding Company (GTCO) lifted the volume of shares traded last week, as a turnover of 3.435 billion shares worth N30.9 billio… [+2993 chars]"},{"source":{"id":null,"name":"Guardian Nigeria"},"author":null,"title":"Minister advises gender violence victims to speak out for justice - Guardian Nigeria","description":"Minister of Women Affairs, Pauline Tallen, has called for the end to violence against women and girls, urging victims to speak out","url":"https://guardian.ng/news/minister-advises-gender-violence-victims-to-speak-out-for-justice/","urlToImage":"https://guardian.ng/wp-content/uploads/2020/03/Dame-Pauline-Tallen.jpg","publishedAt":"2021-11-29T02:47:00Z","content":"Minister of Women Affairs, Pauline Tallen, has called for the end to violence against women and girls, urging victims to speak out for justice to be served.\r\nShe made the appeal during the launch of … [+936 chars]"},{"source":{"id":null,"name":"THISDAY Newspapers"},"author":null,"title":"#EndSARS Report: SERAP, 116 Nigerians Sue Buhari, Seek Arrest of Suspects - THISDAY Newspapers","description":"Udora Orizu Socio-Economic Rights and Accountability Project (SERAP) and 116 concerned Nigerians have filed a lawsuit at the Federal High Court in Abuja to direct and compel President Muhammadu Buh…","url":"https://www.thisdaylive.com/index.php/2021/11/29/endsars-report-serap-116-nigerians-sue-buhari-seek-arrest-of-suspects/","urlToImage":"https://storage.googleapis.com/thisday-846548948316-wp-data/wp-media/2020/05/93b789a3-serap.gif","publishedAt":"2021-11-29T02:43:08Z","content":"Udora Orizu\r\nSocio-Economic Rights and Accountability Project (SERAP) and 116 concerned Nigerians have filed a lawsuit at the Federal High Court in Abuja to direct and compel President Muhammadu Buha… [+2795 chars]"}]}
// To parse the JSON, install Klaxon and do:
//
//   val welcome10 = Welcome10.fromJson(jsonString)


//data class Article (
//    val source: Source,
//    val author: String? = null,
//    val title: String,
//    val description: String? = null,
//    val url: String,
//    val urlToImage: String? = null,
//    val publishedAt: String,
//    val content: String? = null
//)
//
//data class Source (
//    val id: String? = null,
//    val name: String
//)
