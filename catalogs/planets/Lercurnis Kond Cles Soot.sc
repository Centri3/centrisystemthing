Moon	"Soot/Lercurnis B VIII III"
{
	ParentBody     "Cles"
	Class          "Terra"
	Mass            0.04552
	Radius          2479.4
	InertiaMoment   0.34634
	Obliquity       1
	EqAscendNode    -107.18
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Subglacial/Terrestrial"
		Panspermia true
	}

	Surface
	{
		Preset         "lercurnis_kond_cles_soot.cfg"
		SurfStyle       0.45491
		Randomize      (0.100, 0.374, -0.223)
		colorDistMagn   0.081658
		colorDistFreq   330.69
		detailScale     128
		drivenDarkening 0
		seaLevel        -0.17557
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  0.68702
		icecapHeight    0.019269
		climatePole     1
		climateTropic   0.59542
		climateEquator  0.59542
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  0.8
		climateGrassMax  1
		humidity        0.41221
		heightTempGrad  0.18321
		beachWidth      0.0013258
		tropicWidth     0.07
		mainFreq        1.1832
		venusFreq       1.145
		venusMagn       0.9542
		mareFreq        0.001
		mareDensity     0
		terraceProb     0.11086
		erosion         0
		montesMagn      0
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.044806
		dunesFreq       13.297
		dunesFraction   0.48657
		hillsMagn       10
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      10
		riversFreq      6
		riversSin       6
		riftsMagn       59.644
		riftsFreq       3.3017
		riftsSin        4.5576
		canyonsMagn     0.017393
		canyonsFreq     62.658
		canyonsFraction 0
		cracksMagn      0
		cracksFreq      1
		cracksOctaves   15
		craterMagn      2
		craterFreq      5
		craterDensity   1
		craterOctaves   30
		volcanoMagn     0.5406
		volcanoFreq     0.70222
		volcanoDensity  0.16123
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.82162
		volcanoRadius   0.35211
		volcanoTemp     341.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1
		stripeTwist     3.5
		cycloneMagn     2.6112
		cycloneFreq     0.92999
		cycloneDensity  0.28758
		cycloneOctaves  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.93
		SpotBright      2.483
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	Clouds
	{
		Height          12.79
		Velocity        203.4
		BumpHeight      0.62215
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		SubsurfScatBright 1
		SubsurfScatPower  100
		ModulateBright  1
		mainFreq        0.66412
		mainOctaves     0
		Coverage        0.20611
		stripeZones     1
		stripeTwist     3.5
	}

	Clouds
	{
		Height          12.79
		Velocity        203.4
		BumpHeight      0.85369
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		SubsurfScatBright 1
		SubsurfScatPower  100
		ModulateBright  1
		mainFreq        0.66412
		mainOctaves     0
		Coverage        0.20611
		stripeZones     1
		stripeTwist     3.5
	}

	Clouds
	{
		Height          12.79
		Velocity        203.4
		BumpHeight      0.45341
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		SubsurfScatBright 1
		SubsurfScatPower  100
		ModulateBright  1
		mainFreq        0.66412
		mainOctaves     0
		Coverage        0.20611
		stripeZones     1
		stripeTwist     3.5
	}

	NoLava          true

	Atmosphere
	{
		Model          "Lercurnis Kond Cles Soot"
		Height          100
		Density         0.0034376
		Pressure        0.0028001
		Greenhouse      0.8
		Bright          7
		Opacity         1
		SkyLight        1.6305
		Hue             0.002539
		Saturation      0.97482

		Composition
		{
			O2        	98.989
			H2O       	1
			CO2       	0.01
			Kr        	0.00031359
			C8H18     	0.00029193
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      2.64107906
		SemiMajorAxisKm 849857.677
		Eccentricity    0.02
		Inclination     1
		AscendingNode   -107.175573
		ArgOfPericenter -222.59542
		MeanAnomaly     0
	}
}

