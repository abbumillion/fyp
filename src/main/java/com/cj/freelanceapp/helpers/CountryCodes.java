//package com.cj.freelanceapp.helpers;
//
//import com.fasterxml.jackson.databind.JsonNode;
//import org.apache.tomcat.util.json.JSONParser;
//
//public class CountryCodes {
//    public static JsonNode = [
//
//    {
//        "name":"Afghanistan",
//            "countryCode":"AF",
//            "countryISOCode":"AFG",
//            "dialCode":"+93",
//            "currency":"AFN",
//            "flagClass":"flag flag-af"
//    },
//
//    {
//        "name":"Aland Islands",
//            "countryCode":"AX",
//            "countryISOCode":"ALA",
//            "dialCode":"+358",
//            "currency":"EUR",
//            "flagClass":"flag flag-ax"
//    },
//
//    {
//        "name":"Albania",
//            "countryCode":"AL",
//            "countryISOCode":"ALB",
//            "dialCode":"+355",
//            "currency":"ALL",
//            "flagClass":"flag flag-al"
//    },
//
//    {
//        "name":"Algeria",
//            "countryCode":"DZ",
//            "countryISOCode":"DZA",
//            "dialCode":"+213",
//            "currency":"DZD",
//            "flagClass":"flag flag-dz"
//    },
//
//    {
//        "name":"American Samoa",
//            "countryCode":"AS",
//            "countryISOCode":"ASM",
//            "dialCode":"+1684",
//            "currency":"USD",
//            "flagClass":"flag flag-as"
//    },
//
//    {
//        "name":"Andorra",
//            "countryCode":"AD",
//            "countryISOCode":"AND",
//            "dialCode":"+376",
//            "currency":"EUR",
//            "flagClass":"flag flag-ad"
//    },
//
//    {
//        "name":"Angola",
//            "countryCode":"AO",
//            "countryISOCode":"AGO",
//            "dialCode":"+244",
//            "currency":"AOA",
//            "flagClass":"flag flag-ao"
//    },
//
//    {
//        "name":"Anguilla",
//            "countryCode":"AI",
//            "countryISOCode":"AIA",
//            "dialCode":"+1264",
//            "currency":"XCD",
//            "flagClass":"flag flag-ai"
//    },
//
//    {
//        "name":"Antarctica",
//            "countryCode":"AQ",
//            "countryISOCode":"ATA",
//            "dialCode":"+672",
//            "currency":"",
//            "flagClass":"flag flag-aq"
//    },
//
//    {
//        "name":"Antigua and Barbuda",
//            "countryCode":"AG",
//            "countryISOCode":"ATG",
//            "dialCode":"+1268",
//            "currency":"XCD",
//            "flagClass":"flag flag-ag"
//    },
//
//    {
//        "name":"Argentina",
//            "countryCode":"AR",
//            "countryISOCode":"ARG",
//            "dialCode":"+54",
//            "currency":"ARS",
//            "flagClass":"flag flag-ar"
//    },
//
//    {
//        "name":"Armenia",
//            "countryCode":"AM",
//            "countryISOCode":"ARM",
//            "dialCode":"+374",
//            "currency":"AMD",
//            "flagClass":"flag flag-am"
//    },
//
//    {
//        "name":"Aruba",
//            "countryCode":"AW",
//            "countryISOCode":"ABW",
//            "dialCode":"+297",
//            "currency":"AWG",
//            "flagClass":"flag flag-aw"
//    },
//
//    {
//        "name":"Australia",
//            "countryCode":"AU",
//            "countryISOCode":"AUS",
//            "dialCode":"+61",
//            "currency":"AUD",
//            "flagClass":"flag flag-au"
//    },
//
//    {
//        "name":"Austria",
//            "countryCode":"AT",
//            "countryISOCode":"AUT",
//            "dialCode":"+43",
//            "currency":"EUR",
//            "flagClass":"flag flag-at"
//    },
//
//    {
//        "name":"Azerbaijan",
//            "countryCode":"AZ",
//            "countryISOCode":"AZE",
//            "dialCode":"+994",
//            "currency":"AZN",
//            "flagClass":"flag flag-az"
//    },
//
//    {
//        "name":"Bahamas",
//            "countryCode":"BS",
//            "countryISOCode":"BHS",
//            "dialCode":"+1242",
//            "currency":"BSD",
//            "flagClass":"flag flag-bs"
//    },
//
//    {
//        "name":"Bahrain",
//            "countryCode":"BH",
//            "countryISOCode":"BHR",
//            "dialCode":"+973",
//            "currency":"BHD",
//            "flagClass":"flag flag-bh"
//    },
//
//    {
//        "name":"Bangladesh",
//            "countryCode":"BD",
//            "countryISOCode":"BGD",
//            "dialCode":"+880",
//            "currency":"BDT",
//            "flagClass":"flag flag-bd"
//    },
//
//    {
//        "name":"Barbados",
//            "countryCode":"BB",
//            "countryISOCode":"BRB",
//            "dialCode":"+1246",
//            "currency":"BBD",
//            "flagClass":"flag flag-bb"
//    },
//
//    {
//        "name":"Belarus",
//            "countryCode":"BY",
//            "countryISOCode":"BLR",
//            "dialCode":"+375",
//            "currency":"BYR",
//            "flagClass":"flag flag-by"
//    },
//
//    {
//        "name":"Belgium",
//            "countryCode":"BE",
//            "countryISOCode":"BEL",
//            "dialCode":"+32",
//            "currency":"EUR",
//            "flagClass":"flag flag-be"
//    },
//
//    {
//        "name":"Belize",
//            "countryCode":"BZ",
//            "countryISOCode":"BLZ",
//            "dialCode":"+501",
//            "currency":"BZD",
//            "flagClass":"flag flag-bz"
//    },
//
//    {
//        "name":"Benin",
//            "countryCode":"BJ",
//            "countryISOCode":"BEN",
//            "dialCode":"+229",
//            "currency":"XOF",
//            "flagClass":"flag flag-bj"
//    },
//
//    {
//        "name":"Bermuda",
//            "countryCode":"BM",
//            "countryISOCode":"BMU",
//            "dialCode":"+1441",
//            "currency":"BMD",
//            "flagClass":"flag flag-bm"
//    },
//
//    {
//        "name":"Bhutan",
//            "countryCode":"BT",
//            "countryISOCode":"BTN",
//            "dialCode":"+975",
//            "currency":"BTN",
//            "flagClass":"flag flag-bt"
//    },
//
//    {
//        "name":"Bolivia",
//            "countryCode":"BO",
//            "countryISOCode":"BOL",
//            "dialCode":"+591",
//            "currency":"BOB",
//            "flagClass":"flag flag-bo"
//    },
//
//    {
//        "name":"Bonaire, Saint Eustatius and Saba ",
//            "countryCode":"BQ",
//            "countryISOCode":"BES",
//            "dialCode":"+599",
//            "currency":"USD",
//            "flagClass":"flag flag-bq"
//    },
//
//    {
//        "name":"Bosnia and Herzegovina",
//            "countryCode":"BA",
//            "countryISOCode":"BIH",
//            "dialCode":"+387",
//            "currency":"BAM",
//            "flagClass":"flag flag-ba"
//    },
//
//    {
//        "name":"Botswana",
//            "countryCode":"BW",
//            "countryISOCode":"BWA",
//            "dialCode":"+267",
//            "currency":"BWP",
//            "flagClass":"flag flag-bw"
//    },
//
//    {
//        "name":"Bouvet Island",
//            "countryCode":"BV",
//            "countryISOCode":"BVT",
//            "dialCode":"+55",
//            "currency":"NOK",
//            "flagClass":"flag flag-bv"
//    },
//
//    {
//        "name":"Brazil",
//            "countryCode":"BR",
//            "countryISOCode":"BRA",
//            "dialCode":"+55",
//            "currency":"BRL",
//            "flagClass":"flag flag-br"
//    },
//
//    {
//        "name":"British Indian Ocean Territory",
//            "countryCode":"IO",
//            "countryISOCode":"IOT",
//            "dialCode":"+246",
//            "currency":"USD",
//            "flagClass":"flag flag-io"
//    },
//
//    {
//        "name":"British Virgin Islands",
//            "countryCode":"VG",
//            "countryISOCode":"VGB",
//            "dialCode":"+1284",
//            "currency":"USD",
//            "flagClass":"flag flag-vg"
//    },
//
//    {
//        "name":"Brunei",
//            "countryCode":"BN",
//            "countryISOCode":"BRN",
//            "dialCode":"+673",
//            "currency":"BND",
//            "flagClass":"flag flag-bn"
//    },
//
//    {
//        "name":"Bulgaria",
//            "countryCode":"BG",
//            "countryISOCode":"BGR",
//            "dialCode":"+359",
//            "currency":"BGN",
//            "flagClass":"flag flag-bg"
//    },
//
//    {
//        "name":"Burkina Faso",
//            "countryCode":"BF",
//            "countryISOCode":"BFA",
//            "dialCode":"+226",
//            "currency":"XOF",
//            "flagClass":"flag flag-bf"
//    },
//
//    {
//        "name":"Burundi",
//            "countryCode":"BI",
//            "countryISOCode":"BDI",
//            "dialCode":"+257",
//            "currency":"BIF",
//            "flagClass":"flag flag-bi"
//    },
//
//    {
//        "name":"Cambodia",
//            "countryCode":"KH",
//            "countryISOCode":"KHM",
//            "dialCode":"+855",
//            "currency":"KHR",
//            "flagClass":"flag flag-kh"
//    },
//
//    {
//        "name":"Cameroon",
//            "countryCode":"CM",
//            "countryISOCode":"CMR",
//            "dialCode":"+237",
//            "currency":"XAF",
//            "flagClass":"flag flag-cm"
//    },
//
//    {
//        "name":"Canada",
//            "countryCode":"CA",
//            "countryISOCode":"CAN",
//            "dialCode":"+1",
//            "currency":"CAD",
//            "flagClass":"flag flag-ca"
//    },
//
//    {
//        "name":"Cape Verde",
//            "countryCode":"CV",
//            "countryISOCode":"CPV",
//            "dialCode":"+238",
//            "currency":"CVE",
//            "flagClass":"flag flag-cv"
//    },
//
//    {
//        "name":"Cayman Islands",
//            "countryCode":"KY",
//            "countryISOCode":"CYM",
//            "dialCode":"+1345",
//            "currency":"KYD",
//            "flagClass":"flag flag-ky"
//    },
//
//    {
//        "name":"Central African Republic",
//            "countryCode":"CF",
//            "countryISOCode":"CAF",
//            "dialCode":"+236",
//            "currency":"XAF",
//            "flagClass":"flag flag-cf"
//    },
//
//    {
//        "name":"Chad",
//            "countryCode":"TD",
//            "countryISOCode":"TCD",
//            "dialCode":"+235",
//            "currency":"XAF",
//            "flagClass":"flag flag-td"
//    },
//
//    {
//        "name":"Chile",
//            "countryCode":"CL",
//            "countryISOCode":"CHL",
//            "dialCode":"+56",
//            "currency":"CLP",
//            "flagClass":"flag flag-cl"
//    },
//
//    {
//        "name":"China",
//            "countryCode":"CN",
//            "countryISOCode":"CHN",
//            "dialCode":"+86",
//            "currency":"CNY",
//            "flagClass":"flag flag-cn"
//    },
//
//    {
//        "name":"Christmas Island",
//            "countryCode":"CX",
//            "countryISOCode":"CXR",
//            "dialCode":"+61",
//            "currency":"AUD",
//            "flagClass":"flag flag-cx"
//    },
//
//    {
//        "name":"Cocos Islands",
//            "countryCode":"CC",
//            "countryISOCode":"CCK",
//            "dialCode":"+61",
//            "currency":"AUD",
//            "flagClass":"flag flag-cc"
//    },
//
//    {
//        "name":"Colombia",
//            "countryCode":"CO",
//            "countryISOCode":"COL",
//            "dialCode":"+57",
//            "currency":"COP",
//            "flagClass":"flag flag-co"
//    },
//
//    {
//        "name":"Comoros",
//            "countryCode":"KM",
//            "countryISOCode":"COM",
//            "dialCode":"+269",
//            "currency":"KMF",
//            "flagClass":"flag flag-km"
//    },
//
//    {
//        "name":"Cook Islands",
//            "countryCode":"CK",
//            "countryISOCode":"COK",
//            "dialCode":"+682",
//            "currency":"NZD",
//            "flagClass":"flag flag-ck"
//    },
//
//    {
//        "name":"Costa Rica",
//            "countryCode":"CR",
//            "countryISOCode":"CRI",
//            "dialCode":"+506",
//            "currency":"CRC",
//            "flagClass":"flag flag-cr"
//    },
//
//    {
//        "name":"Croatia",
//            "countryCode":"HR",
//            "countryISOCode":"HRV",
//            "dialCode":"+385",
//            "currency":"HRK",
//            "flagClass":"flag flag-hr"
//    },
//
//    {
//        "name":"Cuba",
//            "countryCode":"CU",
//            "countryISOCode":"CUB",
//            "dialCode":"+53",
//            "currency":"CUP",
//            "flagClass":"flag flag-cu"
//    },
//
//    {
//        "name":"Curacao",
//            "countryCode":"CW",
//            "countryISOCode":"CUW",
//            "dialCode":"+599",
//            "currency":"ANG",
//            "flagClass":"flag flag-cw"
//    },
//
//    {
//        "name":"Cyprus",
//            "countryCode":"CY",
//            "countryISOCode":"CYP",
//            "dialCode":"+357",
//            "currency":"EUR",
//            "flagClass":"flag flag-cy"
//    },
//
//    {
//        "name":"Czech Republic",
//            "countryCode":"CZ",
//            "countryISOCode":"CZE",
//            "dialCode":"+420",
//            "currency":"CZK",
//            "flagClass":"flag flag-cz"
//    },
//
//    {
//        "name":"Democratic Republic of the Congo",
//            "countryCode":"CD",
//            "countryISOCode":"COD",
//            "dialCode":"+243",
//            "currency":"CDF",
//            "flagClass":"flag flag-cd"
//    },
//
//    {
//        "name":"Denmark",
//            "countryCode":"DK",
//            "countryISOCode":"DNK",
//            "dialCode":"+45",
//            "currency":"DKK",
//            "flagClass":"flag flag-dk"
//    },
//
//    {
//        "name":"Djibouti",
//            "countryCode":"DJ",
//            "countryISOCode":"DJI",
//            "dialCode":"+253",
//            "currency":"DJF",
//            "flagClass":"flag flag-dj"
//    },
//
//    {
//        "name":"Dominica",
//            "countryCode":"DM",
//            "countryISOCode":"DMA",
//            "dialCode":"+1767",
//            "currency":"XCD",
//            "flagClass":"flag flag-dm"
//    },
//
//    {
//        "name":"Dominican Republic",
//            "countryCode":"DO",
//            "countryISOCode":"DOM",
//            "dialCode":"+1849",
//            "currency":"DOP",
//            "flagClass":"flag flag-do"
//    },
//
//    {
//        "name":"East Timor",
//            "countryCode":"TL",
//            "countryISOCode":"TLS",
//            "dialCode":"+670",
//            "currency":"USD",
//            "flagClass":"flag flag-tl"
//    },
//
//    {
//        "name":"Ecuador",
//            "countryCode":"EC",
//            "countryISOCode":"ECU",
//            "dialCode":"+593",
//            "currency":"USD",
//            "flagClass":"flag flag-ec"
//    },
//
//    {
//        "name":"Egypt",
//            "countryCode":"EG",
//            "countryISOCode":"EGY",
//            "dialCode":"+20",
//            "currency":"EGP",
//            "flagClass":"flag flag-eg"
//    },
//
//    {
//        "name":"El Salvador",
//            "countryCode":"SV",
//            "countryISOCode":"SLV",
//            "dialCode":"+503",
//            "currency":"USD",
//            "flagClass":"flag flag-sv"
//    },
//
//    {
//        "name":"Equatorial Guinea",
//            "countryCode":"GQ",
//            "countryISOCode":"GNQ",
//            "dialCode":"+240",
//            "currency":"XAF",
//            "flagClass":"flag flag-gq"
//    },
//
//    {
//        "name":"Eritrea",
//            "countryCode":"ER",
//            "countryISOCode":"ERI",
//            "dialCode":"+291",
//            "currency":"ERN",
//            "flagClass":"flag flag-er"
//    },
//
//    {
//        "name":"Estonia",
//            "countryCode":"EE",
//            "countryISOCode":"EST",
//            "dialCode":"+372",
//            "currency":"EUR",
//            "flagClass":"flag flag-ee"
//    },
//
//    {
//        "name":"Ethiopia",
//            "countryCode":"ET",
//            "countryISOCode":"ETH",
//            "dialCode":"+251",
//            "currency":"ETB",
//            "flagClass":"flag flag-et"
//    },
//
//    {
//        "name":"Falkland Islands",
//            "countryCode":"FK",
//            "countryISOCode":"FLK",
//            "dialCode":"+500",
//            "currency":"FKP",
//            "flagClass":"flag flag-fk"
//    },
//
//    {
//        "name":"Faroe Islands",
//            "countryCode":"FO",
//            "countryISOCode":"FRO",
//            "dialCode":"+298",
//            "currency":"DKK",
//            "flagClass":"flag flag-fo"
//    },
//
//    {
//        "name":"Fiji",
//            "countryCode":"FJ",
//            "countryISOCode":"FJI",
//            "dialCode":"+679",
//            "currency":"FJD",
//            "flagClass":"flag flag-fj"
//    },
//
//    {
//        "name":"Finland",
//            "countryCode":"FI",
//            "countryISOCode":"FIN",
//            "dialCode":"+358",
//            "currency":"EUR",
//            "flagClass":"flag flag-fi"
//    },
//
//    {
//        "name":"France",
//            "countryCode":"FR",
//            "countryISOCode":"FRA",
//            "dialCode":"+33",
//            "currency":"EUR",
//            "flagClass":"flag flag-fr"
//    },
//
//    {
//        "name":"French Guiana",
//            "countryCode":"GF",
//            "countryISOCode":"GUF",
//            "dialCode":"+594",
//            "currency":"EUR",
//            "flagClass":"flag flag-gf"
//    },
//
//    {
//        "name":"French Polynesia",
//            "countryCode":"PF",
//            "countryISOCode":"PYF",
//            "dialCode":"+689",
//            "currency":"XPF",
//            "flagClass":"flag flag-pf"
//    },
//
//    {
//        "name":"French Southern Territories",
//            "countryCode":"TF",
//            "countryISOCode":"ATF",
//            "dialCode":"+262",
//            "currency":"EUR",
//            "flagClass":"flag flag-tf"
//    },
//
//    {
//        "name":"Gabon",
//            "countryCode":"GA",
//            "countryISOCode":"GAB",
//            "dialCode":"+241",
//            "currency":"XAF",
//            "flagClass":"flag flag-ga"
//    },
//
//    {
//        "name":"Gambia",
//            "countryCode":"GM",
//            "countryISOCode":"GMB",
//            "dialCode":"+220",
//            "currency":"GMD",
//            "flagClass":"flag flag-gm"
//    },
//
//    {
//        "name":"Georgia",
//            "countryCode":"GE",
//            "countryISOCode":"GEO",
//            "dialCode":"+995",
//            "currency":"GEL",
//            "flagClass":"flag flag-ge"
//    },
//
//    {
//        "name":"Germany",
//            "countryCode":"DE",
//            "countryISOCode":"DEU",
//            "dialCode":"+49",
//            "currency":"EUR",
//            "flagClass":"flag flag-de"
//    },
//
//    {
//        "name":"Ghana",
//            "countryCode":"GH",
//            "countryISOCode":"GHA",
//            "dialCode":"+233",
//            "currency":"GHS",
//            "flagClass":"flag flag-gh"
//    },
//
//    {
//        "name":"Gibraltar",
//            "countryCode":"GI",
//            "countryISOCode":"GIB",
//            "dialCode":"+350",
//            "currency":"GIP",
//            "flagClass":"flag flag-gi"
//    },
//
//    {
//        "name":"Greece",
//            "countryCode":"GR",
//            "countryISOCode":"GRC",
//            "dialCode":"+30",
//            "currency":"EUR",
//            "flagClass":"flag flag-gr"
//    },
//
//    {
//        "name":"Greenland",
//            "countryCode":"GL",
//            "countryISOCode":"GRL",
//            "dialCode":"+299",
//            "currency":"DKK",
//            "flagClass":"flag flag-gl"
//    },
//
//    {
//        "name":"Grenada",
//            "countryCode":"GD",
//            "countryISOCode":"GRD",
//            "dialCode":"+1473",
//            "currency":"XCD",
//            "flagClass":"flag flag-gd"
//    },
//
//    {
//        "name":"Guadeloupe",
//            "countryCode":"GP",
//            "countryISOCode":"GLP",
//            "dialCode":"+590",
//            "currency":"EUR",
//            "flagClass":"flag flag-gp"
//    },
//
//    {
//        "name":"Guam",
//            "countryCode":"GU",
//            "countryISOCode":"GUM",
//            "dialCode":"+1671",
//            "currency":"USD",
//            "flagClass":"flag flag-gu"
//    },
//
//    {
//        "name":"Guatemala",
//            "countryCode":"GT",
//            "countryISOCode":"GTM",
//            "dialCode":"+502",
//            "currency":"GTQ",
//            "flagClass":"flag flag-gt"
//    },
//
//    {
//        "name":"Guernsey",
//            "countryCode":"GG",
//            "countryISOCode":"GGY",
//            "dialCode":"+44",
//            "currency":"GBP",
//            "flagClass":"flag flag-gg"
//    },
//
//    {
//        "name":"Guinea",
//            "countryCode":"GN",
//            "countryISOCode":"GIN",
//            "dialCode":"+224",
//            "currency":"GNF",
//            "flagClass":"flag flag-gn"
//    },
//
//    {
//        "name":"Guinea-Bissau",
//            "countryCode":"GW",
//            "countryISOCode":"GNB",
//            "dialCode":"+245",
//            "currency":"XOF",
//            "flagClass":"flag flag-gw"
//    },
//
//    {
//        "name":"Guyana",
//            "countryCode":"GY",
//            "countryISOCode":"GUY",
//            "dialCode":"+592",
//            "currency":"GYD",
//            "flagClass":"flag flag-gy"
//    },
//
//    {
//        "name":"Haiti",
//            "countryCode":"HT",
//            "countryISOCode":"HTI",
//            "dialCode":"+509",
//            "currency":"HTG",
//            "flagClass":"flag flag-ht"
//    },
//
//    {
//        "name":"Heard Island and McDonald Islands",
//            "countryCode":"HM",
//            "countryISOCode":"HMD",
//            "dialCode":"+ ",
//            "currency":"AUD",
//            "flagClass":"flag flag-hm"
//    },
//
//    {
//        "name":"Honduras",
//            "countryCode":"HN",
//            "countryISOCode":"HND",
//            "dialCode":"+504",
//            "currency":"HNL",
//            "flagClass":"flag flag-hn"
//    },
//
//    {
//        "name":"Hong Kong",
//            "countryCode":"HK",
//            "countryISOCode":"HKG",
//            "dialCode":"+852",
//            "currency":"HKD",
//            "flagClass":"flag flag-hk"
//    },
//
//    {
//        "name":"Hungary",
//            "countryCode":"HU",
//            "countryISOCode":"HUN",
//            "dialCode":"+36",
//            "currency":"HUF",
//            "flagClass":"flag flag-hu"
//    },
//
//    {
//        "name":"Iceland",
//            "countryCode":"IS",
//            "countryISOCode":"ISL",
//            "dialCode":"+354",
//            "currency":"ISK",
//            "flagClass":"flag flag-is"
//    },
//
//    {
//        "name":"India",
//            "countryCode":"IN",
//            "countryISOCode":"IND",
//            "dialCode":"+91",
//            "currency":"INR",
//            "flagClass":"flag flag-in"
//    },
//
//    {
//        "name":"Indonesia",
//            "countryCode":"ID",
//            "countryISOCode":"IDN",
//            "dialCode":"+62",
//            "currency":"IDR",
//            "flagClass":"flag flag-id"
//    },
//
//    {
//        "name":"Iran",
//            "countryCode":"IR",
//            "countryISOCode":"IRN",
//            "dialCode":"+98",
//            "currency":"IRR",
//            "flagClass":"flag flag-ir"
//    },
//
//    {
//        "name":"Iraq",
//            "countryCode":"IQ",
//            "countryISOCode":"IRQ",
//            "dialCode":"+964",
//            "currency":"IQD",
//            "flagClass":"flag flag-iq"
//    },
//
//    {
//        "name":"Ireland",
//            "countryCode":"IE",
//            "countryISOCode":"IRL",
//            "dialCode":"+353",
//            "currency":"EUR",
//            "flagClass":"flag flag-ie"
//    },
//
//    {
//        "name":"Isle of Man",
//            "countryCode":"IM",
//            "countryISOCode":"IMN",
//            "dialCode":"+44",
//            "currency":"GBP",
//            "flagClass":"flag flag-im"
//    },
//
//    {
//        "name":"Israel",
//            "countryCode":"IL",
//            "countryISOCode":"ISR",
//            "dialCode":"+972",
//            "currency":"ILS",
//            "flagClass":"flag flag-il"
//    },
//
//    {
//        "name":"Italy",
//            "countryCode":"IT",
//            "countryISOCode":"ITA",
//            "dialCode":"+39",
//            "currency":"EUR",
//            "flagClass":"flag flag-it"
//    },
//
//    {
//        "name":"Ivory Coast",
//            "countryCode":"CI",
//            "countryISOCode":"CIV",
//            "dialCode":"+225",
//            "currency":"XOF",
//            "flagClass":"flag flag-ci"
//    },
//
//    {
//        "name":"Jamaica",
//            "countryCode":"JM",
//            "countryISOCode":"JAM",
//            "dialCode":"+1876",
//            "currency":"JMD",
//            "flagClass":"flag flag-jm"
//    },
//
//    {
//        "name":"Japan",
//            "countryCode":"JP",
//            "countryISOCode":"JPN",
//            "dialCode":"+81",
//            "currency":"JPY",
//            "flagClass":"flag flag-jp"
//    },
//
//    {
//        "name":"Jersey",
//            "countryCode":"JE",
//            "countryISOCode":"JEY",
//            "dialCode":"+44",
//            "currency":"GBP",
//            "flagClass":"flag flag-je"
//    },
//
//    {
//        "name":"Jordan",
//            "countryCode":"JO",
//            "countryISOCode":"JOR",
//            "dialCode":"+962",
//            "currency":"JOD",
//            "flagClass":"flag flag-jo"
//    },
//
//    {
//        "name":"Kazakhstan",
//            "countryCode":"KZ",
//            "countryISOCode":"KAZ",
//            "dialCode":"+7",
//            "currency":"KZT",
//            "flagClass":"flag flag-kz"
//    },
//
//    {
//        "name":"Kenya",
//            "countryCode":"KE",
//            "countryISOCode":"KEN",
//            "dialCode":"+254",
//            "currency":"KES",
//            "flagClass":"flag flag-ke"
//    },
//
//    {
//        "name":"Kiribati",
//            "countryCode":"KI",
//            "countryISOCode":"KIR",
//            "dialCode":"+686",
//            "currency":"AUD",
//            "flagClass":"flag flag-ki"
//    },
//
//    {
//        "name":"Kosovo",
//            "countryCode":"XK",
//            "countryISOCode":"XKX",
//            "dialCode":"+383",
//            "currency":"EUR",
//            "flagClass":"flag flag-xk"
//    },
//
//    {
//        "name":"Kuwait",
//            "countryCode":"KW",
//            "countryISOCode":"KWT",
//            "dialCode":"+965",
//            "currency":"KWD",
//            "flagClass":"flag flag-kw"
//    },
//
//    {
//        "name":"Kyrgyzstan",
//            "countryCode":"KG",
//            "countryISOCode":"KGZ",
//            "dialCode":"+996",
//            "currency":"KGS",
//            "flagClass":"flag flag-kg"
//    },
//
//    {
//        "name":"Laos",
//            "countryCode":"LA",
//            "countryISOCode":"LAO",
//            "dialCode":"+856",
//            "currency":"LAK",
//            "flagClass":"flag flag-la"
//    },
//
//    {
//        "name":"Latvia",
//            "countryCode":"LV",
//            "countryISOCode":"LVA",
//            "dialCode":"+371",
//            "currency":"EUR",
//            "flagClass":"flag flag-lv"
//    },
//
//    {
//        "name":"Lebanon",
//            "countryCode":"LB",
//            "countryISOCode":"LBN",
//            "dialCode":"+961",
//            "currency":"LBP",
//            "flagClass":"flag flag-lb"
//    },
//
//    {
//        "name":"Lesotho",
//            "countryCode":"LS",
//            "countryISOCode":"LSO",
//            "dialCode":"+266",
//            "currency":"LSL",
//            "flagClass":"flag flag-ls"
//    },
//
//    {
//        "name":"Liberia",
//            "countryCode":"LR",
//            "countryISOCode":"LBR",
//            "dialCode":"+231",
//            "currency":"LRD",
//            "flagClass":"flag flag-lr"
//    },
//
//    {
//        "name":"Libya",
//            "countryCode":"LY",
//            "countryISOCode":"LBY",
//            "dialCode":"+218",
//            "currency":"LYD",
//            "flagClass":"flag flag-ly"
//    },
//
//    {
//        "name":"Liechtenstein",
//            "countryCode":"LI",
//            "countryISOCode":"LIE",
//            "dialCode":"+423",
//            "currency":"CHF",
//            "flagClass":"flag flag-li"
//    },
//
//    {
//        "name":"Lithuania",
//            "countryCode":"LT",
//            "countryISOCode":"LTU",
//            "dialCode":"+370",
//            "currency":"LTL",
//            "flagClass":"flag flag-lt"
//    },
//
//    {
//        "name":"Luxembourg",
//            "countryCode":"LU",
//            "countryISOCode":"LUX",
//            "dialCode":"+352",
//            "currency":"EUR",
//            "flagClass":"flag flag-lu"
//    },
//
//    {
//        "name":"Macao",
//            "countryCode":"MO",
//            "countryISOCode":"MAC",
//            "dialCode":"+853",
//            "currency":"MOP",
//            "flagClass":"flag flag-mo"
//    },
//
//    {
//        "name":"Macedonia",
//            "countryCode":"MK",
//            "countryISOCode":"MKD",
//            "dialCode":"+389",
//            "currency":"MKD",
//            "flagClass":"flag flag-mk"
//    },
//
//    {
//        "name":"Madagascar",
//            "countryCode":"MG",
//            "countryISOCode":"MDG",
//            "dialCode":"+261",
//            "currency":"MGA",
//            "flagClass":"flag flag-mg"
//    },
//
//    {
//        "name":"Malawi",
//            "countryCode":"MW",
//            "countryISOCode":"MWI",
//            "dialCode":"+265",
//            "currency":"MWK",
//            "flagClass":"flag flag-mw"
//    },
//
//    {
//        "name":"Malaysia",
//            "countryCode":"MY",
//            "countryISOCode":"MYS",
//            "dialCode":"+60",
//            "currency":"MYR",
//            "flagClass":"flag flag-my"
//    },
//
//    {
//        "name":"Maldives",
//            "countryCode":"MV",
//            "countryISOCode":"MDV",
//            "dialCode":"+960",
//            "currency":"MVR",
//            "flagClass":"flag flag-mv"
//    },
//
//    {
//        "name":"Mali",
//            "countryCode":"ML",
//            "countryISOCode":"MLI",
//            "dialCode":"+223",
//            "currency":"XOF",
//            "flagClass":"flag flag-ml"
//    },
//
//    {
//        "name":"Malta",
//            "countryCode":"MT",
//            "countryISOCode":"MLT",
//            "dialCode":"+356",
//            "currency":"EUR",
//            "flagClass":"flag flag-mt"
//    },
//
//    {
//        "name":"Marshall Islands",
//            "countryCode":"MH",
//            "countryISOCode":"MHL",
//            "dialCode":"+692",
//            "currency":"USD",
//            "flagClass":"flag flag-mh"
//    },
//
//    {
//        "name":"Martinique",
//            "countryCode":"MQ",
//            "countryISOCode":"MTQ",
//            "dialCode":"+596",
//            "currency":"EUR",
//            "flagClass":"flag flag-mq"
//    },
//
//    {
//        "name":"Mauritania",
//            "countryCode":"MR",
//            "countryISOCode":"MRT",
//            "dialCode":"+222",
//            "currency":"MRO",
//            "flagClass":"flag flag-mr"
//    },
//
//    {
//        "name":"Mauritius",
//            "countryCode":"MU",
//            "countryISOCode":"MUS",
//            "dialCode":"+230",
//            "currency":"MUR",
//            "flagClass":"flag flag-mu"
//    },
//
//    {
//        "name":"Mayotte",
//            "countryCode":"YT",
//            "countryISOCode":"MYT",
//            "dialCode":"+262",
//            "currency":"EUR",
//            "flagClass":"flag flag-yt"
//    },
//
//    {
//        "name":"Mexico",
//            "countryCode":"MX",
//            "countryISOCode":"MEX",
//            "dialCode":"+52",
//            "currency":"MXN",
//            "flagClass":"flag flag-mx"
//    },
//
//    {
//        "name":"Micronesia",
//            "countryCode":"FM",
//            "countryISOCode":"FSM",
//            "dialCode":"+691",
//            "currency":"USD",
//            "flagClass":"flag flag-fm"
//    },
//
//    {
//        "name":"Moldova",
//            "countryCode":"MD",
//            "countryISOCode":"MDA",
//            "dialCode":"+373",
//            "currency":"MDL",
//            "flagClass":"flag flag-md"
//    },
//
//    {
//        "name":"Monaco",
//            "countryCode":"MC",
//            "countryISOCode":"MCO",
//            "dialCode":"+377",
//            "currency":"EUR",
//            "flagClass":"flag flag-mc"
//    },
//
//    {
//        "name":"Mongolia",
//            "countryCode":"MN",
//            "countryISOCode":"MNG",
//            "dialCode":"+976",
//            "currency":"MNT",
//            "flagClass":"flag flag-mn"
//    },
//
//    {
//        "name":"Montenegro",
//            "countryCode":"ME",
//            "countryISOCode":"MNE",
//            "dialCode":"+382",
//            "currency":"EUR",
//            "flagClass":"flag flag-me"
//    },
//
//    {
//        "name":"Montserrat",
//            "countryCode":"MS",
//            "countryISOCode":"MSR",
//            "dialCode":"+1664",
//            "currency":"XCD",
//            "flagClass":"flag flag-ms"
//    },
//
//    {
//        "name":"Morocco",
//            "countryCode":"MA",
//            "countryISOCode":"MAR",
//            "dialCode":"+212",
//            "currency":"MAD",
//            "flagClass":"flag flag-ma"
//    },
//
//    {
//        "name":"Mozambique",
//            "countryCode":"MZ",
//            "countryISOCode":"MOZ",
//            "dialCode":"+258",
//            "currency":"MZN",
//            "flagClass":"flag flag-mz"
//    },
//
//    {
//        "name":"Myanmar",
//            "countryCode":"MM",
//            "countryISOCode":"MMR",
//            "dialCode":"+95",
//            "currency":"MMK",
//            "flagClass":"flag flag-mm"
//    },
//
//    {
//        "name":"Namibia",
//            "countryCode":"NA",
//            "countryISOCode":"NAM",
//            "dialCode":"+264",
//            "currency":"NAD",
//            "flagClass":"flag flag-na"
//    },
//
//    {
//        "name":"Nauru",
//            "countryCode":"NR",
//            "countryISOCode":"NRU",
//            "dialCode":"+674",
//            "currency":"AUD",
//            "flagClass":"flag flag-nr"
//    },
//
//    {
//        "name":"Nepal",
//            "countryCode":"NP",
//            "countryISOCode":"NPL",
//            "dialCode":"+977",
//            "currency":"NPR",
//            "flagClass":"flag flag-np"
//    },
//
//    {
//        "name":"Netherlands",
//            "countryCode":"NL",
//            "countryISOCode":"NLD",
//            "dialCode":"+31",
//            "currency":"EUR",
//            "flagClass":"flag flag-nl"
//    },
//
//    {
//        "name":"New Caledonia",
//            "countryCode":"NC",
//            "countryISOCode":"NCL",
//            "dialCode":"+687",
//            "currency":"XPF",
//            "flagClass":"flag flag-nc"
//    },
//
//    {
//        "name":"New Zealand",
//            "countryCode":"NZ",
//            "countryISOCode":"NZL",
//            "dialCode":"+64",
//            "currency":"NZD",
//            "flagClass":"flag flag-nz"
//    },
//
//    {
//        "name":"Nicaragua",
//            "countryCode":"NI",
//            "countryISOCode":"NIC",
//            "dialCode":"+505",
//            "currency":"NIO",
//            "flagClass":"flag flag-ni"
//    },
//
//    {
//        "name":"Niger",
//            "countryCode":"NE",
//            "countryISOCode":"NER",
//            "dialCode":"+227",
//            "currency":"XOF",
//            "flagClass":"flag flag-ne"
//    },
//
//    {
//        "name":"Nigeria",
//            "countryCode":"NG",
//            "countryISOCode":"NGA",
//            "dialCode":"+234",
//            "currency":"NGN",
//            "flagClass":"flag flag-ng"
//    },
//
//    {
//        "name":"Niue",
//            "countryCode":"NU",
//            "countryISOCode":"NIU",
//            "dialCode":"+683",
//            "currency":"NZD",
//            "flagClass":"flag flag-nu"
//    },
//
//    {
//        "name":"Norfolk Island",
//            "countryCode":"NF",
//            "countryISOCode":"NFK",
//            "dialCode":"+672",
//            "currency":"AUD",
//            "flagClass":"flag flag-nf"
//    },
//
//    {
//        "name":"North Korea",
//            "countryCode":"KP",
//            "countryISOCode":"PRK",
//            "dialCode":"+850",
//            "currency":"KPW",
//            "flagClass":"flag flag-kp"
//    },
//
//    {
//        "name":"Northern Mariana Islands",
//            "countryCode":"MP",
//            "countryISOCode":"MNP",
//            "dialCode":"+1670",
//            "currency":"USD",
//            "flagClass":"flag flag-mp"
//    },
//
//    {
//        "name":"Norway",
//            "countryCode":"NO",
//            "countryISOCode":"NOR",
//            "dialCode":"+47",
//            "currency":"NOK",
//            "flagClass":"flag flag-no"
//    },
//
//    {
//        "name":"Oman",
//            "countryCode":"OM",
//            "countryISOCode":"OMN",
//            "dialCode":"+968",
//            "currency":"OMR",
//            "flagClass":"flag flag-om"
//    },
//
//    {
//        "name":"Pakistan",
//            "countryCode":"PK",
//            "countryISOCode":"PAK",
//            "dialCode":"+92",
//            "currency":"PKR",
//            "flagClass":"flag flag-pk"
//    },
//
//    {
//        "name":"Palau",
//            "countryCode":"PW",
//            "countryISOCode":"PLW",
//            "dialCode":"+680",
//            "currency":"USD",
//            "flagClass":"flag flag-pw"
//    },
//
//    {
//        "name":"Palestinian Territory",
//            "countryCode":"PS",
//            "countryISOCode":"PSE",
//            "dialCode":"+970",
//            "currency":"ILS",
//            "flagClass":"flag flag-ps"
//    },
//
//    {
//        "name":"Panama",
//            "countryCode":"PA",
//            "countryISOCode":"PAN",
//            "dialCode":"+507",
//            "currency":"PAB",
//            "flagClass":"flag flag-pa"
//    },
//
//    {
//        "name":"Papua New Guinea",
//            "countryCode":"PG",
//            "countryISOCode":"PNG",
//            "dialCode":"+675",
//            "currency":"PGK",
//            "flagClass":"flag flag-pg"
//    },
//
//    {
//        "name":"Paraguay",
//            "countryCode":"PY",
//            "countryISOCode":"PRY",
//            "dialCode":"+595",
//            "currency":"PYG",
//            "flagClass":"flag flag-py"
//    },
//
//    {
//        "name":"Peru",
//            "countryCode":"PE",
//            "countryISOCode":"PER",
//            "dialCode":"+51",
//            "currency":"PEN",
//            "flagClass":"flag flag-pe"
//    },
//
//    {
//        "name":"Philippines",
//            "countryCode":"PH",
//            "countryISOCode":"PHL",
//            "dialCode":"+63",
//            "currency":"PHP",
//            "flagClass":"flag flag-ph"
//    },
//
//    {
//        "name":"Pitcairn",
//            "countryCode":"PN",
//            "countryISOCode":"PCN",
//            "dialCode":"+870",
//            "currency":"NZD",
//            "flagClass":"flag flag-pn"
//    },
//
//    {
//        "name":"Poland",
//            "countryCode":"PL",
//            "countryISOCode":"POL",
//            "dialCode":"+48",
//            "currency":"PLN",
//            "flagClass":"flag flag-pl"
//    },
//
//    {
//        "name":"Portugal",
//            "countryCode":"PT",
//            "countryISOCode":"PRT",
//            "dialCode":"+351",
//            "currency":"EUR",
//            "flagClass":"flag flag-pt"
//    },
//
//    {
//        "name":"Puerto Rico",
//            "countryCode":"PR",
//            "countryISOCode":"PRI",
//            "dialCode":"+1939",
//            "currency":"USD",
//            "flagClass":"flag flag-pr"
//    },
//
//    {
//        "name":"Qatar",
//            "countryCode":"QA",
//            "countryISOCode":"QAT",
//            "dialCode":"+974",
//            "currency":"QAR",
//            "flagClass":"flag flag-qa"
//    },
//
//    {
//        "name":"Republic of the Congo",
//            "countryCode":"CG",
//            "countryISOCode":"COG",
//            "dialCode":"+242",
//            "currency":"XAF",
//            "flagClass":"flag flag-cg"
//    },
//
//    {
//        "name":"Reunion",
//            "countryCode":"RE",
//            "countryISOCode":"REU",
//            "dialCode":"+262",
//            "currency":"EUR",
//            "flagClass":"flag flag-re"
//    },
//
//    {
//        "name":"Romania",
//            "countryCode":"RO",
//            "countryISOCode":"ROU",
//            "dialCode":"+40",
//            "currency":"RON",
//            "flagClass":"flag flag-ro"
//    },
//
//    {
//        "name":"Russia",
//            "countryCode":"RU",
//            "countryISOCode":"RUS",
//            "dialCode":"+7",
//            "currency":"RUB",
//            "flagClass":"flag flag-ru"
//    },
//
//    {
//        "name":"Rwanda",
//            "countryCode":"RW",
//            "countryISOCode":"RWA",
//            "dialCode":"+250",
//            "currency":"RWF",
//            "flagClass":"flag flag-rw"
//    },
//
//    {
//        "name":"Saint Barthelemy",
//            "countryCode":"BL",
//            "countryISOCode":"BLM",
//            "dialCode":"+590",
//            "currency":"EUR",
//            "flagClass":"flag flag-bl"
//    },
//
//    {
//        "name":"Saint Helena",
//            "countryCode":"SH",
//            "countryISOCode":"SHN",
//            "dialCode":"+290",
//            "currency":"SHP",
//            "flagClass":"flag flag-sh"
//    },
//
//    {
//        "name":"Saint Kitts and Nevis",
//            "countryCode":"KN",
//            "countryISOCode":"KNA",
//            "dialCode":"+1869",
//            "currency":"XCD",
//            "flagClass":"flag flag-kn"
//    },
//
//    {
//        "name":"Saint Lucia",
//            "countryCode":"LC",
//            "countryISOCode":"LCA",
//            "dialCode":"+1758",
//            "currency":"XCD",
//            "flagClass":"flag flag-lc"
//    },
//
//    {
//        "name":"Saint Martin",
//            "countryCode":"MF",
//            "countryISOCode":"MAF",
//            "dialCode":"+590",
//            "currency":"EUR",
//            "flagClass":"flag flag-mf"
//    },
//
//    {
//        "name":"Saint Pierre and Miquelon",
//            "countryCode":"PM",
//            "countryISOCode":"SPM",
//            "dialCode":"+508",
//            "currency":"EUR",
//            "flagClass":"flag flag-pm"
//    },
//
//    {
//        "name":"Saint Vincent and the Grenadines",
//            "countryCode":"VC",
//            "countryISOCode":"VCT",
//            "dialCode":"+1784",
//            "currency":"XCD",
//            "flagClass":"flag flag-vc"
//    },
//
//    {
//        "name":"Samoa",
//            "countryCode":"WS",
//            "countryISOCode":"WSM",
//            "dialCode":"+685",
//            "currency":"WST",
//            "flagClass":"flag flag-ws"
//    },
//
//    {
//        "name":"San Marino",
//            "countryCode":"SM",
//            "countryISOCode":"SMR",
//            "dialCode":"+378",
//            "currency":"EUR",
//            "flagClass":"flag flag-sm"
//    },
//
//    {
//        "name":"Sao Tome and Principe",
//            "countryCode":"ST",
//            "countryISOCode":"STP",
//            "dialCode":"+239",
//            "currency":"STD",
//            "flagClass":"flag flag-st"
//    },
//
//    {
//        "name":"Saudi Arabia",
//            "countryCode":"SA",
//            "countryISOCode":"SAU",
//            "dialCode":"+966",
//            "currency":"SAR",
//            "flagClass":"flag flag-sa"
//    },
//
//    {
//        "name":"Senegal",
//            "countryCode":"SN",
//            "countryISOCode":"SEN",
//            "dialCode":"+221",
//            "currency":"XOF",
//            "flagClass":"flag flag-sn"
//    },
//
//    {
//        "name":"Serbia",
//            "countryCode":"RS",
//            "countryISOCode":"SRB",
//            "dialCode":"+381",
//            "currency":"RSD",
//            "flagClass":"flag flag-rs"
//    },
//
//    {
//        "name":"Seychelles",
//            "countryCode":"SC",
//            "countryISOCode":"SYC",
//            "dialCode":"+248",
//            "currency":"SCR",
//            "flagClass":"flag flag-sc"
//    },
//
//    {
//        "name":"Sierra Leone",
//            "countryCode":"SL",
//            "countryISOCode":"SLE",
//            "dialCode":"+232",
//            "currency":"SLL",
//            "flagClass":"flag flag-sl"
//    },
//
//    {
//        "name":"Singapore",
//            "countryCode":"SG",
//            "countryISOCode":"SGP",
//            "dialCode":"+65",
//            "currency":"SGD",
//            "flagClass":"flag flag-sg"
//    },
//
//    {
//        "name":"Sint Maarten",
//            "countryCode":"SX",
//            "countryISOCode":"SXM",
//            "dialCode":"+599",
//            "currency":"ANG",
//            "flagClass":"flag flag-sx"
//    },
//
//    {
//        "name":"Slovakia",
//            "countryCode":"SK",
//            "countryISOCode":"SVK",
//            "dialCode":"+421",
//            "currency":"EUR",
//            "flagClass":"flag flag-sk"
//    },
//
//    {
//        "name":"Slovenia",
//            "countryCode":"SI",
//            "countryISOCode":"SVN",
//            "dialCode":"+386",
//            "currency":"EUR",
//            "flagClass":"flag flag-si"
//    },
//
//    {
//        "name":"Solomon Islands",
//            "countryCode":"SB",
//            "countryISOCode":"SLB",
//            "dialCode":"+677",
//            "currency":"SBD",
//            "flagClass":"flag flag-sb"
//    },
//
//    {
//        "name":"Somalia",
//            "countryCode":"SO",
//            "countryISOCode":"SOM",
//            "dialCode":"+252",
//            "currency":"SOS",
//            "flagClass":"flag flag-so"
//    },
//
//    {
//        "name":"South Africa",
//            "countryCode":"ZA",
//            "countryISOCode":"ZAF",
//            "dialCode":"+27",
//            "currency":"ZAR",
//            "flagClass":"flag flag-za"
//    },
//
//    {
//        "name":"South Georgia and the South Sandwich Islands",
//            "countryCode":"GS",
//            "countryISOCode":"SGS",
//            "dialCode":"+500",
//            "currency":"GBP",
//            "flagClass":"flag flag-gs"
//    },
//
//    {
//        "name":"South Korea",
//            "countryCode":"KR",
//            "countryISOCode":"KOR",
//            "dialCode":"+82",
//            "currency":"KRW",
//            "flagClass":"flag flag-kr"
//    },
//
//    {
//        "name":"South Sudan",
//            "countryCode":"SS",
//            "countryISOCode":"SSD",
//            "dialCode":"+211",
//            "currency":"SSP",
//            "flagClass":"flag flag-ss"
//    },
//
//    {
//        "name":"Spain",
//            "countryCode":"ES",
//            "countryISOCode":"ESP",
//            "dialCode":"+34",
//            "currency":"EUR",
//            "flagClass":"flag flag-es"
//    },
//
//    {
//        "name":"Sri Lanka",
//            "countryCode":"LK",
//            "countryISOCode":"LKA",
//            "dialCode":"+94",
//            "currency":"LKR",
//            "flagClass":"flag flag-lk"
//    },
//
//    {
//        "name":"Sudan",
//            "countryCode":"SD",
//            "countryISOCode":"SDN",
//            "dialCode":"+249",
//            "currency":"SDG",
//            "flagClass":"flag flag-sd"
//    },
//
//    {
//        "name":"Suriname",
//            "countryCode":"SR",
//            "countryISOCode":"SUR",
//            "dialCode":"+597",
//            "currency":"SRD",
//            "flagClass":"flag flag-sr"
//    },
//
//    {
//        "name":"Svalbard and Jan Mayen",
//            "countryCode":"SJ",
//            "countryISOCode":"SJM",
//            "dialCode":"+47",
//            "currency":"NOK",
//            "flagClass":"flag flag-sj"
//    },
//
//    {
//        "name":"Swaziland",
//            "countryCode":"SZ",
//            "countryISOCode":"SWZ",
//            "dialCode":"+268",
//            "currency":"SZL",
//            "flagClass":"flag flag-sz"
//    },
//
//    {
//        "name":"Sweden",
//            "countryCode":"SE",
//            "countryISOCode":"SWE",
//            "dialCode":"+46",
//            "currency":"SEK",
//            "flagClass":"flag flag-se"
//    },
//
//    {
//        "name":"Switzerland",
//            "countryCode":"CH",
//            "countryISOCode":"CHE",
//            "dialCode":"+41",
//            "currency":"CHF",
//            "flagClass":"flag flag-ch"
//    },
//
//    {
//        "name":"Syria",
//            "countryCode":"SY",
//            "countryISOCode":"SYR",
//            "dialCode":"+963",
//            "currency":"SYP",
//            "flagClass":"flag flag-sy"
//    },
//
//    {
//        "name":"Taiwan",
//            "countryCode":"TW",
//            "countryISOCode":"TWN",
//            "dialCode":"+886",
//            "currency":"TWD",
//            "flagClass":"flag flag-tw"
//    },
//
//    {
//        "name":"Tajikistan",
//            "countryCode":"TJ",
//            "countryISOCode":"TJK",
//            "dialCode":"+992",
//            "currency":"TJS",
//            "flagClass":"flag flag-tj"
//    },
//
//    {
//        "name":"Tanzania",
//            "countryCode":"TZ",
//            "countryISOCode":"TZA",
//            "dialCode":"+255",
//            "currency":"TZS",
//            "flagClass":"flag flag-tz"
//    },
//
//    {
//        "name":"Thailand",
//            "countryCode":"TH",
//            "countryISOCode":"THA",
//            "dialCode":"+66",
//            "currency":"THB",
//            "flagClass":"flag flag-th"
//    },
//
//    {
//        "name":"Togo",
//            "countryCode":"TG",
//            "countryISOCode":"TGO",
//            "dialCode":"+228",
//            "currency":"XOF",
//            "flagClass":"flag flag-tg"
//    },
//
//    {
//        "name":"Tokelau",
//            "countryCode":"TK",
//            "countryISOCode":"TKL",
//            "dialCode":"+690",
//            "currency":"NZD",
//            "flagClass":"flag flag-tk"
//    },
//
//    {
//        "name":"Tonga",
//            "countryCode":"TO",
//            "countryISOCode":"TON",
//            "dialCode":"+676",
//            "currency":"TOP",
//            "flagClass":"flag flag-to"
//    },
//
//    {
//        "name":"Trinidad and Tobago",
//            "countryCode":"TT",
//            "countryISOCode":"TTO",
//            "dialCode":"+1868",
//            "currency":"TTD",
//            "flagClass":"flag flag-tt"
//    },
//
//    {
//        "name":"Tunisia",
//            "countryCode":"TN",
//            "countryISOCode":"TUN",
//            "dialCode":"+216",
//            "currency":"TND",
//            "flagClass":"flag flag-tn"
//    },
//
//    {
//        "name":"Turkey",
//            "countryCode":"TR",
//            "countryISOCode":"TUR",
//            "dialCode":"+90",
//            "currency":"TRY",
//            "flagClass":"flag flag-tr"
//    },
//
//    {
//        "name":"Turkmenistan",
//            "countryCode":"TM",
//            "countryISOCode":"TKM",
//            "dialCode":"+993",
//            "currency":"TMT",
//            "flagClass":"flag flag-tm"
//    },
//
//    {
//        "name":"Turks and Caicos Islands",
//            "countryCode":"TC",
//            "countryISOCode":"TCA",
//            "dialCode":"+1649",
//            "currency":"USD",
//            "flagClass":"flag flag-tc"
//    },
//
//    {
//        "name":"Tuvalu",
//            "countryCode":"TV",
//            "countryISOCode":"TUV",
//            "dialCode":"+688",
//            "currency":"AUD",
//            "flagClass":"flag flag-tv"
//    },
//
//    {
//        "name":"U.S. Virgin Islands",
//            "countryCode":"VI",
//            "countryISOCode":"VIR",
//            "dialCode":"+1340",
//            "currency":"USD",
//            "flagClass":"flag flag-vi"
//    },
//
//    {
//        "name":"Uganda",
//            "countryCode":"UG",
//            "countryISOCode":"UGA",
//            "dialCode":"+256",
//            "currency":"UGX",
//            "flagClass":"flag flag-ug"
//    },
//
//    {
//        "name":"Ukraine",
//            "countryCode":"UA",
//            "countryISOCode":"UKR",
//            "dialCode":"+380",
//            "currency":"UAH",
//            "flagClass":"flag flag-ua"
//    },
//
//    {
//        "name":"United Arab Emirates",
//            "countryCode":"AE",
//            "countryISOCode":"ARE",
//            "dialCode":"+971",
//            "currency":"AED",
//            "flagClass":"flag flag-ae"
//    },
//
//    {
//        "name":"United Kingdom",
//            "countryCode":"GB",
//            "countryISOCode":"GBR",
//            "dialCode":"+44",
//            "currency":"GBP",
//            "flagClass":"flag flag-gb"
//    },
//
//    {
//        "name":"United States",
//            "countryCode":"US",
//            "countryISOCode":"USA",
//            "dialCode":"+1",
//            "currency":"USD",
//            "flagClass":"flag flag-us"
//    },
//
//    {
//        "name":"United States Minor Outlying Islands",
//            "countryCode":"UM",
//            "countryISOCode":"UMI",
//            "dialCode":"+1",
//            "currency":"USD",
//            "flagClass":"flag flag-um"
//    },
//
//    {
//        "name":"Uruguay",
//            "countryCode":"UY",
//            "countryISOCode":"URY",
//            "dialCode":"+598",
//            "currency":"UYU",
//            "flagClass":"flag flag-uy"
//    },
//
//    {
//        "name":"Uzbekistan",
//            "countryCode":"UZ",
//            "countryISOCode":"UZB",
//            "dialCode":"+998",
//            "currency":"UZS",
//            "flagClass":"flag flag-uz"
//    },
//
//    {
//        "name":"Vanuatu",
//            "countryCode":"VU",
//            "countryISOCode":"VUT",
//            "dialCode":"+678",
//            "currency":"VUV",
//            "flagClass":"flag flag-vu"
//    },
//
//    {
//        "name":"Vatican",
//            "countryCode":"VA",
//            "countryISOCode":"VAT",
//            "dialCode":"+379",
//            "currency":"EUR",
//            "flagClass":"flag flag-va"
//    },
//
//    {
//        "name":"Venezuela",
//            "countryCode":"VE",
//            "countryISOCode":"VEN",
//            "dialCode":"+58",
//            "currency":"VEF",
//            "flagClass":"flag flag-ve"
//    },
//
//    {
//        "name":"Vietnam",
//            "countryCode":"VN",
//            "countryISOCode":"VNM",
//            "dialCode":"+84",
//            "currency":"VND",
//            "flagClass":"flag flag-vn"
//    },
//
//    {
//        "name":"Wallis and Futuna",
//            "countryCode":"WF",
//            "countryISOCode":"WLF",
//            "dialCode":"+681",
//            "currency":"XPF",
//            "flagClass":"flag flag-wf"
//    },
//
//    {
//        "name":"Western Sahara",
//            "countryCode":"EH",
//            "countryISOCode":"ESH",
//            "dialCode":"+212",
//            "currency":"MAD",
//            "flagClass":"flag flag-eh"
//    },
//
//    {
//        "name":"Yemen",
//            "countryCode":"YE",
//            "countryISOCode":"YEM",
//            "dialCode":"+967",
//            "currency":"YER",
//            "flagClass":"flag flag-ye"
//    },
//
//    {
//        "name":"Zambia",
//            "countryCode":"ZM",
//            "countryISOCode":"ZMB",
//            "dialCode":"+260",
//            "currency":"ZMK",
//            "flagClass":"flag flag-zm"
//    },
//
//    {
//        "name":"Zimbabwe",
//            "countryCode":"ZW",
//            "countryISOCode":"ZWE",
//            "dialCode":"+263",
//            "currency":"ZWL",
//            "flagClass":"flag flag-zw"
//    }
//]
//}
