Planet	"Mons/Lercurnis B IX"
{
	ParentBody     "Kond"
	Class          "Terra"
	Mass            0.4821
	Radius          5146.8
	InertiaMoment   0.32861
	RotationPeriod  116.74
	RotationEpoch   1451545
	Obliquity       0.40864
	EqAscendNode    140.16

	AlbedoBond      0.61714
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Subglacial"
	}

	Surface
	{
		Preset         "lercurnis_kond_mons.cfg"
		SurfStyle       0.68367
		Randomize      (-0.748, -0.076, 1.176)
		colorDistMagn   0.87023
		colorDistFreq   522.74
		detailScale     128
		drivenDarkening 0
		seaLevel        0.23664
		snowLevel       0.92
		tropicLatitude  0.56489
		icecapLatitude  0.73282
		icecapHeight    0
		climatePole     1
		climateTropic   0.5625
		climateEquator  0.5625
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.15564
		heightTempGrad  0.375
		beachWidth      0.0015053
		tropicWidth     0.5
		mainFreq        1.0687
		venusFreq       1.4351
		venusMagn       0.38168
		mareFreq        2.2767
		mareDensity     0
		terraceProb     0.21433
		erosion         0.22137
		montesMagn      1
		montesFreq      100
		montesSpiky     1
		montesFraction  1
		dunesMagn       0
		dunesFreq       0
		dunesFraction   0
		hillsMagn       1
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      7
		riversFreq      6
		riversSin       10
		riftsMagn       100
		riftsFreq       7
		riftsSin        7
		canyonsMagn     1
		canyonsFreq     50
		canyonsFraction 0
		cracksMagn      0
		cracksFreq      1
		cracksOctaves   15
		craterMagn      1.5
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		volcanoMagn     1
		volcanoFreq     0.21374
		volcanoDensity  0.02
		volcanoOctaves  0
		volcanoActivity 2
		volcanoFlows    0.9771
		volcanoRadius   1
		volcanoTemp     3000
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1
		stripeTwist     3.5
		cycloneMagn     0.71078
		cycloneFreq     0.65187
		cycloneDensity  0.37433
		cycloneOctaves  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.5
		SpotBright      1.4994
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	Clouds
	{
		Height          12.79
		Velocity        91.661
		BumpHeight      4.6145
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateColor  (0.273 0.185 0.108)
		ModulateBright  1
		Opacity         0.53435
		mainFreq        0.57252
		mainOctaves     0
		Coverage        0.73282
		stripeZones     1
		stripeTwist     3.5
	}

	Clouds
	{
		Height          12.79
		Velocity        56.829
		BumpHeight      5.1885
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateColor  (0.258 0.183 0.111)
		ModulateBright  1
		Opacity         0.41221
		mainFreq        0.57252
		mainOctaves     0
		Coverage        0.73282
		stripeZones     1
		stripeTwist     3.5
	}

	NoLava          true

	Atmosphere
	{
		Model          "Lercurnis Kond Ge"
		Height          127.9
		Density         0.0068408
		Pressure        0.005618
		Greenhouse      3.2408
		Bright          2.9008
		Opacity         1
		SkyLight        1.8741
		Hue             -0.0038168
		Saturation      0.53435

		Composition
		{
			C2H2      	32.597
			H2O       	22.737
			CO2       	16.878
			NH3       	16.123
			N2        	5.9752
			H2S       	2.3949
			SO2       	1.4615
			C2H6      	0.83549
			C2H4      	0.71505
			C3H8      	0.17028
			CO        	0.056968
			CH4       	0.049214
			C8H18     	0.0050088
			Ar        	0.0012812
			Cl2       	1.7782e-05
			Kr        	1.3136e-05
			Ne        	1.2445e-05
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          1.269675
		SemiMajorAxis   0.505235547
		Eccentricity    0
		Inclination     0.408636783
		AscendingNode   140.160231
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

