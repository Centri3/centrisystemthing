Moon	"Sow/Lercurnis B VII III"
{
	ParentBody     "Pel"
	Class          "Terra"
	Mass            0.073424
	Radius          2835.4
	InertiaMoment   0.33618
	Obliquity       0.1
	EqAscendNode    178.63
	TidalLocked     true

	AlbedoBond      0.4
	AlbedoGeom      0.46
	Brightness      1
	BrightnessReal  1

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
		Panspermia true
	}

	Surface
	{
		Preset         "lercurnis_kond_pel_sow.cfg"
		SurfStyle       0.024528
		Randomize      (0.932, -0.877, -0.527)
		colorDistMagn   0.079923
		colorDistFreq   333.3
		detailScale     128
		drivenDarkening 0
		seaLevel        0.16794
		snowLevel       2
		tropicLatitude  1
		icecapLatitude  0.76336
		icecapHeight    0.13
		climatePole     1
		climateTropic   0.27481
		climateEquator  1
		climateSteppeMin -1
		climateSteppeMax 0.8
		climateForestMin 0.58779
		climateForestMax 0.80153
		climateGrassMin  0.52672
		climateGrassMax  0.74046
		humidity        0.85496
		heightTempGrad  1
		beachWidth      0
		tropicWidth     0
		mainFreq        1.1832
		venusFreq       1.1407
		venusMagn       0.61703
		mareFreq        6.6447
		mareDensity     0.046521
		terraceProb     0.40932
		erosion         0.11944
		montesMagn      0.1
		montesFreq      150
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.053967
		dunesFreq       26.063
		dunesFraction   0.79772
		hillsMagn       1
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      8.3969
		riversFreq      7
		riversSin       7
		riftsMagn       100
		riftsFreq       7
		riftsSin        7
		canyonsMagn     0.027038
		canyonsFreq     83.899
		canyonsFraction 0.97386
		cracksMagn      0
		cracksFreq      0.3
		cracksOctaves   15
		craterMagn      0.1
		craterFreq      5
		craterDensity   1
		craterOctaves   30
		volcanoMagn     0.4
		volcanoFreq     1.0534
		volcanoDensity  0.19084
		volcanoOctaves  5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1
		volcanoTemp     0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1
		stripeTwist     3.5
		cycloneMagn     3.3873
		cycloneFreq     0.82632
		cycloneDensity  0.39132
		cycloneOctaves  0
		BumpHeight      20
		BumpOffset      3.3589
		DiffMapAlpha   "Water"
		SpecBrightWater 1
		SpecBrightIce   0.85
		RoughnessWater  0.48855
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.5
		SpotBright      2.4632
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Ocean
	{
		Depth           3.3589
		Hapke           0
		SpotBright      2
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateBright  1

		Composition
		{
			H2O       	100
		}
	}

	Clouds
	{
		Height          11.922
		Velocity        10
		BumpHeight      3.7082
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		SpotBrightCB    2
		SpotWidthCB     0.03
		DayAmbient      0.07
		SubsurfScatBright 0.1374
		SubsurfScatPower  100
		ModulateBright  1
		mainFreq        0.68702
		mainOctaves     10
		Coverage        0
		stripeZones     1
		stripeTwist     3.5
	}

	Clouds
	{
		Height          11.922
		Velocity        10
		BumpHeight      3.7082
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		SpotBrightCB    2
		SpotWidthCB     0.03
		DayAmbient      0.07
		SubsurfScatBright 0.19847
		SubsurfScatPower  98.473
		ModulateBright  1
		mainFreq        0.68702
		mainOctaves     10
		Coverage        0
		stripeZones     1
		stripeTwist     3.5
	}

	Clouds
	{
		Height          11.922
		Velocity        20
		BumpHeight      3.7082
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		SpotBrightCB    2
		SpotWidthCB     0.03
		DayAmbient      0.07
		SubsurfScatBright 0.21374
		SubsurfScatPower  29.008
		ModulateBright  1
		Opacity         0.24427
		mainFreq        0.68702
		mainOctaves     10
		Coverage        0
		stripeZones     1
		stripeTwist     3.5
	}

	Clouds
	{
		Height          11.922
		Velocity        30
		BumpHeight      3.7082
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		SpotBrightCB    2
		SpotWidthCB     0.03
		DayAmbient      0.07
		SubsurfScatBright 0.16794
		SubsurfScatPower  41.985
		ModulateBright  1
		Opacity         0.30534
		mainFreq        0.68702
		mainOctaves     10
		Coverage        0
		stripeZones     1
		stripeTwist     3.5
	}

	Clouds
	{
		Height          11.922
		Velocity        40
		BumpHeight      3.7082
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		SpotBrightCB    2
		SpotWidthCB     0.03
		DayAmbient      0.07
		SubsurfScatBright 0.14504
		SubsurfScatPower  35.115
		ModulateBright  1
		Opacity         0.18321
		mainFreq        0.68702
		mainOctaves     10
		Coverage        0
		stripeZones     1
		stripeTwist     3.5
	}

	Clouds
	{
		Height          11.922
		Velocity        50
		BumpHeight      3.7082
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		SpotBrightCB    2
		SpotWidthCB     0.03
		DayAmbient      0.07
		SubsurfScatBright 0.17557
		SubsurfScatPower  33.588
		ModulateBright  1
		Opacity         0.076336
		mainFreq        0.68702
		mainOctaves     10
		Coverage        0
		stripeZones     1
		stripeTwist     3.5
	}

	Clouds
	{
		Height          11.922
		Velocity        229.01
		BumpHeight      3.7082
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		SpotBrightCB    2
		SpotWidthCB     0.03
		DayAmbient      0.07
		SubsurfScatBright 0.21374
		SubsurfScatPower  34.351
		ModulateBright  1
		Opacity         0.091603
		mainFreq        0.68702
		mainOctaves     10
		Coverage        0
		stripeZones     1
		stripeTwist     3.5
	}

	Clouds
	{
		Height          11.922
		Velocity        503.82
		BumpHeight      3.7082
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		SpotBrightCB    2
		SpotWidthCB     0.03
		DayAmbient      0.07
		SubsurfScatBright 0.24427
		SubsurfScatPower  43.511
		ModulateBright  1
		Opacity         0.24427
		mainFreq        0.68702
		mainOctaves     10
		Coverage        0
		stripeZones     1
		stripeTwist     3.5
	}

	Clouds
	{
		Height          11.922
		Velocity        320.61
		BumpHeight      3.7082
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		SpotBrightCB    2
		SpotWidthCB     0.03
		DayAmbient      0.07
		SubsurfScatBright 0.24427
		SubsurfScatPower  42.748
		ModulateBright  1
		Opacity         0.32061
		mainFreq        0.68702
		mainOctaves     10
		Coverage        0
		stripeZones     1
		stripeTwist     3.5
	}

	Clouds
	{
		Height          11.922
		Velocity        412.21
		BumpHeight      3.7082
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		SpotBrightCB    2
		SpotWidthCB     0.03
		DayAmbient      0.07
		SubsurfScatBright 0.58779
		SubsurfScatPower  22.137
		ModulateBright  1
		Opacity         0.35115
		mainFreq        0.68702
		mainOctaves     10
		Coverage        0
		stripeZones     1
		stripeTwist     3.5
	}

	NoLava          true

	Atmosphere
	{
		Model          "Lercurnis Kond Pel Sow"
		Height          100
		Density         4.2253e-08
		Pressure        5
		Greenhouse      34.351
		Bright          5
		Opacity         1
		SkyLight        3.3333
		Hue             0
		Saturation      1

		Composition
		{
			N2        	90
			O2        	8
			CO2       	1
			H2O       	1
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.77915288
		SemiMajorAxisKm 876708.476
		Eccentricity    0.001
		Inclination     0.1
		AscendingNode   178.625954
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

